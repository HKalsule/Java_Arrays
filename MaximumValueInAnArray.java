package com.company;

public class MaximumValueInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,16,8,3};
        int max = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value In The Given Array Is : " + max);
    }
}
