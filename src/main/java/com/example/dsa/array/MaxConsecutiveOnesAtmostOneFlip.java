package com.example.dsa.array;

public class MaxConsecutiveOnesAtmostOneFlip {
    public static int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int[] numOnesBefore = new int[n];
        int[] numOnesAfter= new int[n];
        int countOnes = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                countOnes++;

            }
            else {
                max = Math.max(max,countOnes);
                numOnesBefore[i] = countOnes;
                countOnes = 0;
            }

        }
        countOnes = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==1){
                countOnes++;

            }
            else {
                max = Math.max(max,countOnes);
                numOnesAfter[i] = countOnes;
                countOnes = 0;
            }

        }
        if(max ==0){
            return max;
        }
        for(int i=0;i<n;i++){
            max = Math.max(max,numOnesBefore[i]+numOnesAfter[i]+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
