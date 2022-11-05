package com.company;
public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();


        Greeting lamdaGreeting = () -> System.out.println("Hello world");
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello world");
            }
        };

        greeter.greet(lamdaGreeting);
        greeter.greet(innerClassGreeting);
    }
}






