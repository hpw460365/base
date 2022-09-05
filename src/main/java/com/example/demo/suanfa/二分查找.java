package com.example.demo.suanfa;

public class 二分查找 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,8,2,3,9,4};
        int n =search(arr, 0, arr.length-1, 9);
        System.out.println(n);
    }


    private static int search(int[] arr, int low, int hign, int value){
        if(low > hign){
            return -1;
        }
        int mid = (hign + low)/2;
        if(arr[mid] == value){
            return mid;
        }else if(arr[mid] > value){
            return search(arr, low, mid - 1, value);
        }else {
            return search(arr, mid + 1, hign, value);
        }
    }
}
