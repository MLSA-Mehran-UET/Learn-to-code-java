package com.company;

public class Main {
    public static void main(String[] args) {

//        Creating 2-D array
        int[][][] array = {{{10,20,30},{40,50,60},{70,80,90}}};
//     Extracting elements using for-each loop
        for (int[][] i : array){
            for (int[] j : i){
                for (int k : j)
                    System.out.println("Element in array is : " + k);
            }
        }
    }
}
