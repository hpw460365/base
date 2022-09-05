package com.example.demo.suanfa.shidapaixu;

import java.util.Arrays;

public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,8,2,3,9,4};
        new 冒泡排序().sort(arr);
        Arrays.stream(arr).forEach(i ->System.out.println(i));
    }

    public void sort(int[] arr){
        if(arr.length <=1)return;

        for(int i = 0; i< arr.length; i++){
            for(int j=0; j< arr.length -i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

}
