package com.company;

public class Array3D {
    public static void main(String[] args) {
        int[][][] flats = new int[2][3][2];

        // Assigning flat numbers
        flats[0][0][0] = 101;
        flats[0][0][1] = 102;
        flats[0][1][0] = 103;
        flats[0][1][1] = 104;
        flats[0][2][0] = 105;
        flats[0][2][1] = 106;
        flats[1][0][0] = 201;
        flats[1][0][1] = 202;
        flats[1][1][0] = 203;
        flats[1][1][1] = 204;
        flats[1][2][0] = 205;
        flats[1][2][1] = 206;

        System.out.println("Length Of Array is: " + flats.length + "\n");

        System.out.println("Displayed 3D Array :");
        for (int i = 0; i < flats.length; i++) {
            System.out.println("Floor " + i + ":");
            for (int j = 0; j < flats[i].length; j++) {
                for (int k = 0; k < flats[i][j].length; k++) {
                    System.out.print(flats[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
