package com.example.dsa.array;

public class rainWaterWorstApproach {

    public static void main(String[] args) {
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr = {4,2,0,3,2,5};
        int size = arr.length;
        int find_area = 0;
        for(int i=0;i<size;i++){
            int lmax = 0;
            int rmax = 0;
            int left = i-1;
            int right = i+1;
            while(left>=0){
                if(arr[left]>lmax){
                    lmax = arr[left];
                }
                left--;
            }
            while(right<size){
                if(arr[right]>rmax){
                    rmax = arr[right];

                }
                right++;
            }
            System.out.println(lmax+" "+rmax);
            System.out.println(Math.max(Math.min(lmax,rmax) - arr[i],0));
            find_area+=Math.max(Math.min(lmax,rmax) - arr[i],0);
        }
        System.out.println("area covered ="+find_area);
    }


}
