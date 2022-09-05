package com.example.demo.suanfa.dongtaiguihua;

public class 最大子序和 {
    public static void main(String[] args) {
        int[] nums =new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(result(nums));
    }

    private static int result(int[] nums){
        int len = nums.length;
        if(len == 0) return 0;
        if (len ==1) return nums[0];


        int temp = 0;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i =1; i<len; i++){
            dp[i]=Math.max(nums[i], nums[i]+dp[i-1]);
            if(dp[i]>temp){
                temp = dp[i];
            }
        }
        return temp;
    }
}
