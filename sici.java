package com.company;
import java.util.*;

public class sici
{
    public static void main(String[]args)
    {
        double p ,t ,r ,si ,ci;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        p = sc.nextDouble();
        System.out.println("enter number of years:");
        t =sc.nextDouble();
        System.out.println("Enter the rate of intrest");
        r=sc.nextDouble();
        si=(p*t*r)/100;
        ci=p*Math.pow(1.0+r/100.0,t)-p;
        System.out.println("simple intrest="+si);
        System.out.println("compound intrest="+ci);

    }
}
