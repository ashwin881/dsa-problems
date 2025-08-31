package com.example.dsa.array;

import java.util.Arrays;

public class minSwapSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        int[] arr = {5,4,1,2,3};
        //case when array is already sorted
        int swapCount = 0;
        for(int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int pos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            if(pos!=i){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                swapCount++;
            }
        }
        System.out.println(Arrays.stream(arr).boxed().toList());
        System.out.println("swap count = "+swapCount);
    }
}
