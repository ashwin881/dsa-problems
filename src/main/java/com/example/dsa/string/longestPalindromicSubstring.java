package com.example.dsa.string;

public class longestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "";
        int n = s.length();
        int[][] memArray= new int[n][n];
        System.out.println(findLongestPalindrome(s,0,s.length()-1,memArray));
    }

    private static int findLongestPalindrome(String s,int i,int j,int[][] memArray) {

        if(i>j){
            return 0;
        }

        if(memArray[i][j]!=0){
            return memArray[i][j];
        }
        if(i==j){
            memArray[i][j]=1;
            return memArray[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            int remLength = findLongestPalindrome(s,i+1,j-1,memArray);
            if(remLength==j-i-1){
                memArray[i][j] = 2+remLength;
                return memArray[i][j];
            }
        }
        memArray[i][j] =  Math.max(findLongestPalindrome(s,i+1,j,memArray),findLongestPalindrome(s,i,j-1,memArray));
        return memArray[i][j];
    }
}
