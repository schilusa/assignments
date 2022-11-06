package com.company;

interface SimpleInterest {
    int simpleInterest(int a, int b, int c);
}
public class SimpleIntrest {
    public static void main(String[] args) {
        SimpleInterest SIlambda= ( var P, var T, var R ) ->
        {
            System.out.println((P * T * R) / 100);
            return (P * T * R) / 100;
        };
        SIlambda.simpleInterest(100000,1,1);
    }
}

