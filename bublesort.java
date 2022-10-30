package com.company;
import java.util.Scanner;

public class bublesort {
    public static void main(String args[])
    {
        int a,i,j, n,temp;

        Scanner s =new Scanner(System.in);
        System.out.println("enter the size of an array");
        n = s.nextInt();
        int array[] = new int[n];
        System.out.println("enter elements inti an array");

        for(a = 0; a < n; a++) {
            array[a] = s.nextInt();
        }
        System.out.println("elements before sorting are");
        for(a=0;a<n;a++) {
            System.out.println(array[a]);
        }
        for(i=0;i<n;i++)
            for(j=i+1;j<n;j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        System.out.println("elements after sorting are");
        for(i=0;i<n;i++) {
            System.out.println(array[i]);
        }
        for(i=0;i<n;i++)
            for (j=i+1;j<n;j++)
            {
                if(array[i]>array[j]);
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println(" elements afetr sorting are");
                for(i=0;i<n;i++)
                {
                    System.out.println(array[i]);
                }

        }
    }
}
