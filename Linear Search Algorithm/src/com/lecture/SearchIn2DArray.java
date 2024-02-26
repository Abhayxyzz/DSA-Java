package com.lecture;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {23, 8, 1},
                {12, 30, 10, 15},
                {2, 27, 7, 13},
                {16, 4}
        };
        int target = 30;
        int[] ans = search(arr, target); //  return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]== target){
                    return new int[]{row, col};
                }
                
            }
            
        }
        return new int[]{-1,-1};

    }
}
