package com.company;

public class PresentInArrayOrNot {
    public static void main(String[] args){
        int[] marks ={1,2,3,4,5};
        int num = 3;
        boolean present = false;
        for(int i=0 ; i<marks.length ; i++){
        if(num == marks[i]){
            present = true;
            break;
        }
    }
        if(present){
            System.out.println("Yes! The Number Is Present!!");
        }
        else{
            System.out.println("Oops! The Number Is Not Present!!");
        }
    }
}
