package com.example.dsa.array;

import com.example.Main;

public class subarraySort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,6,7,9,10,11};
        int[] arrSorted = {1,2,3,4,5,6};
        int[] arrLeftSorted = {1,2,3,4,6,5,7,8};
        //find min subarray that needs to be sorted so that array gets sorted
        //approach find the part from left and right where sorting is missed
        // then go from that point to left and right where the elements can be involved in sorting
        //return [-1,-1] if nothing is found
        System.out.println(subarraySortMethod(arrLeftSorted));
        
    }

    private static String subarraySortMethod(int[] arr) {
        int size = arr.length;
        int beg = 0,last = size-1;
        while(beg<size-1){
            if(arr[beg+1]<arr[beg]){
                break;
            }
            beg++;
        }
        while(last>0){
            if(arr[last]<arr[last-1]){
                break;
            }
            last--;
        }
        System.out.println(beg+" "+last);
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        // find min and max value in unsorted set
        for(int i=beg;i<=last;i++){
            minElement = Math.min(arr[i],minElement);
            maxElement = Math.max(arr[i],maxElement);
        }
        int i = beg;
        int j = last;
        if(minElement==Integer.MAX_VALUE && maxElement == Integer.MIN_VALUE){
            return -1+" "+-1;
        }
        while( i>0){
            if(arr[i-1]>minElement){
                i--;
            }
            else {
                break;
            }
        }
        while(j<size-1){
            if(arr[j+1]<maxElement){
                j++;
            }
            else {
                break;
            }
        }
        return i+" "+j;
    }
}
