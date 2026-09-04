class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum+nums[i];

        }

        int max=max(nums);
        int min=min(nums);
        int circular=totalSum-min;
        if(min==totalSum){
            return max;

        }
        return Math.max(max,circular);

        
    }
    public int max(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public int min(int[] nums){
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.min(sum+nums[i],nums[i]);
            min=Math.min(min,sum);
        }
        return min;
    } 
}