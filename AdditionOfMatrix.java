package com.company;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{7,8,9},{1,2,3}};
        int [][] result = {{0,0,0},{0,0,0}};

        for (int i=0 ; i<mat1.length ; i++){
            for (int j=0 ; j<mat1[i].length ; j++){
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Addition of 2 Matrix Is : ") ;  
        for (int i=0 ; i<result.length ; i++){
            for (int j=0 ; j<result[i].length ; j++){ 
            System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
