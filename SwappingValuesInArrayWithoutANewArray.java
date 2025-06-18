package com.company;

public class SwappingValuesInArrayWithoutANewArray {
    public static void main(String[] args) {
        
    int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0 ; i<n ; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        
        System.out.println("Swapped or Reversed Array Is : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
}
}
