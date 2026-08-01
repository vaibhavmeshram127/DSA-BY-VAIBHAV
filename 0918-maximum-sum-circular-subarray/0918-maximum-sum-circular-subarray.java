class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum+nums[i];
        }
        
        int max=kadneMAX(nums);
        int min=kadneMIN(nums);
        int circular=totalSum-min;
        if(max<0){
            return max;
        }else{
            return Math.max(circular,max);

        }
        



        
    }
    public int kadneMAX(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }

        }
        return max;

    }
    
    public int kadneMIN(int[] nums){
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            sum=Math.min(sum,nums[i]);
            min=Math.min(min,sum);

        }
        return min;

    }
}