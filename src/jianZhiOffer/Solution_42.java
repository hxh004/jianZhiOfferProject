package jianZhiOffer;

public class Solution_42 {
    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,-2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int currentMax=nums[0],sum;
        for(int i = 0;i<nums.length;i++){
            sum = nums[i];
            if(sum>currentMax) currentMax=sum;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum>currentMax) currentMax=sum;
            }
        }
        return currentMax;
    }
}
