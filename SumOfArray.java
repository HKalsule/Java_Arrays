package com.company;

public class SumOfArray {
    public static void main(String[] args) {
 
        // Sum of Array

        int[] marks ={1,2,3,4,5};
        int sum = 0;
        for (int i=0 ; i<marks.length ; i++){
            sum = sum + marks[i];
        }
        System.out.println("Sum of values in the Arrays Are : " + sum); 
    }
}
