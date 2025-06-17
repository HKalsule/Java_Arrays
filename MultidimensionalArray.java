package com.company;

public class MultidimensionalArray {
    public static void main(String[] args){
        int [] marks;
        int [][] flats;
        flats = new int[2][3];
        System.out.println("Length Of Array is : ");
        System.out.println(flats.length);
        System.out.print("\n");

        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        System.out.println("Displayed Array : ");
        for(int i=0 ; i<flats.length ; i++){
            for (int j=0 ; j<=flats.length ; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }                

    }
}
