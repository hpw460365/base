package com.example.demo.suanfa.shidapaixu;

import java.util.Arrays;

public class 快速排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,8,2,3,9,4};
        new 快速排序().sort(arr,0, arr.length-1);
        Arrays.stream(arr).forEach(i ->System.out.println(i));
    }

    public void sort(int[] arr, int low, int high){
        if(low>=high)return;
        int i = low;
        int j = high;
        int temp = arr[low];
        while (i<j){
            while (i<j && arr[j]>=temp) {j--;};
            while (i<j && arr[i]<=temp) {i++;};
            swap(arr, i, j);
            System.out.println(Arrays.toString(arr) + " 正在排序中.........");
        }
        swap(arr, i, low);
        System.out.println(Arrays.toString(arr) + " 正在排序中.........");
        sort(arr, low, i-1);
        sort(arr, i + 1, high);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

}
