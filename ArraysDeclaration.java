package com.company;

public class ArraysDeclaration {
    public static void main(String[] args) {

        // Declaration Method 1 
        int [] marks ;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 10;
        marks[2] = 00;
        marks[3] = 20;
        marks[4] = 30;
        System.out.println(marks[2]);

        // Declaration Method 2
        int [] mark = new int[5];
        mark[0] = 10;
        mark[1] = 20;
        mark[2] = 30;
        mark[3] = 40;
        mark[4] = 50;
        System.out.println(mark[4]);

        // Declaration Method 3
        int[] markss ={100,90,80,70,60};
        System.out.println(markss[1]);
    }
}