package com.example.demo.suanfa.tanxinsuanfa;

import java.util.Arrays;
import java.util.Comparator;

public class 区间调度 {

    public static void main(String[] args) {
        int[][] intvs ={{1,3},{2,4},{3,6}};
        System.out.println(schedule(intvs));
    }
    static int schedule(int[][] intvs){
        if(intvs.length == 0)return -1;

        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count =1;

        int x_end = intvs[0][1];
        for(int[] interval: intvs){
            int start = interval[0];
            if(start>=x_end){
                x_end = interval[1];
                count++;
            }
        }
        return count;
    }
}
