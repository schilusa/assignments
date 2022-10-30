package com.company;
import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        System.out.println("enter a value");
        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt();
        int rem, sum = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("it is amstrong number");
        }
    }
}

