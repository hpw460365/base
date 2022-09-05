package com.example.demo.suanfa.shidapaixu;

import java.util.Arrays;

public class 堆排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,2,39,32,19,22};
        heapSort(arr);
        Arrays.stream(arr).forEach(i->System.out.println(i));
    }
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
//        int len = arr.length;
        // 构建大顶堆，这里其实就是把待排序序列，变成一个大顶堆结构的数组
        buildMaxHeap(arr);

        // 交换堆顶和当前末尾的节点，重置大顶堆
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    private static void buildMaxHeap(int[] arr){
        int cur = arr.length/2-1;
        for(int i = cur; i >=0; i--){
            heapify(arr, i, arr.length);
        }
    }

    private static void heapify(int[] arr, int father, int len) {
        // 先根据堆性质，找出它左右节点的索引
        int left = 2 * father + 1;
        int right = 2 * father + 2;
        // 默认当前节点（父节点）是最大值。
        int temp = father;
        if (left < len && arr[left] > arr[temp]) {
            // 如果有左节点，并且左节点的值更大，更新最大值的索引
            temp = left;
        }
        if (right < len && arr[right] > arr[temp]) {
            // 如果有右节点，并且右节点的值更大，更新最大值的索引
            temp = right;
        }

        if (temp != father) {
            // 如果最大值不是当前非叶子节点的值，那么就把当前节点和最大值的子节点值互换
            swap(arr, father, temp);
            // 因为互换之后，子节点的值变了，如果该子节点也有自己的子节点，仍需要再次调整。
            heapify(arr, temp, len);
        }
    }



    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}


