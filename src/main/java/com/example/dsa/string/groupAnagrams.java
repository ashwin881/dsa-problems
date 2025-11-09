package com.example.dsa.string;

import java.util.*;

public class groupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
//            if(!anagramMap.containsKey(sortedStr)){
//                anagramMap.put(sortedStr, new ArrayList<>(List.of(str)));
//            }
//            else{
//                anagramMap.get(sortedStr).add(str);
//            }
        }
        System.out.println(anagramMap);
    }
}
