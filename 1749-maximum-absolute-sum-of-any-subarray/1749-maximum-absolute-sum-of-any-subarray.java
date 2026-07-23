class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sumMax=0;
        for(int i=0;i<nums.length;i++){
            sumMax=sumMax+nums[i];
            max=Math.max(max,sumMax);
            if(sumMax<0){
                sumMax=0;
               
            }

        }
        int min=Integer.MAX_VALUE;
        int sumMin=0;
        for(int i=0;i<nums.length;i++){
            sumMin=sumMin+nums[i];
            sumMin=Math.min(nums[i],sumMin);
            min=Math.min(min,sumMin);

            

        }
        return Math.max(max,Math.abs(min));
        
    }
}