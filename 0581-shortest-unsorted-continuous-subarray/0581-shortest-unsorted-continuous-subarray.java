class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(nums[i]<max){
                right=i;
                
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            if(nums[i]>min){
                left=i;
                
            }
        }
        if(left==0 && right==0){
            return 0;
        }
        return right-left+1;
        
    }
}