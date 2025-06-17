package com.company;

public class ArraysDisplay {
    public static void main(String[] args){
        float [] number = {100,200,300,400,500};

    // Displaying the Array (Naive Way)
        System.out.println("Display of Array Easiest Way :");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);

    // Displaying the Array using for loop
        System.out.println("Display of Array Using For Loop :");
        for(int i=0 ; i<number.length ; i++){
            System.out.println(number[i]);
        }

    // Displaying the Array using for loop in reverse order
        System.out.println("Display of Array Using For Loop in reverse order :");
        for(int j=number.length -1 ; j>=0 ; j--){
            System.out.println(number[j]);
        }

    // Displaying the Array using for-each loop
        System.out.println("Display of Array Using For-Each Loop :");
        for(float element: number){
            System.out.println(element);
        }
    }
}
