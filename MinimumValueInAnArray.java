package com.company;

public class MinimumValueInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,2,1,16,8,3};
        int max = 0;
        int min = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum Value In The Given Array Is : " + min);

    }
}
