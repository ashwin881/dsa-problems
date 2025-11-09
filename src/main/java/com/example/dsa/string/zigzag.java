package com.example.dsa.string;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class zigzag {

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int noRows = 3;
       List<List<Character>> rowList = new ArrayList<>();
       for(int i=0;i<noRows;i++){
           rowList.add(new ArrayList<>());
       }
       boolean up = true;
       int currRow = 0;
       for(char s:str.toCharArray()){
           rowList.get(currRow).add(s);
           up = (currRow == 0 || currRow == noRows - 1)? !up:up;
           currRow = up?--currRow:++currRow;

       }
       String output = "";
        System.out.println(rowList);

    }
}
