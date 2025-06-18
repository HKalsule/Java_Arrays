package com.company;

public class SwapptingValuesInArrayCreatingNewArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] newarray = {0,0,0,0,0,0};
        System.out.println("Length Of The Array Is : " + array.length);
        for (int i=0 ; i<array.length ; i++){
            int l = array.length;
            int j = l-i-1;
            newarray[i] = array[j];
        }
        System.out.println("Swapped Array Is : ");
        for(int i=0 ; i<array.length ; i++){
        System.out.print(newarray[i] + " ");
        }
    }
}
