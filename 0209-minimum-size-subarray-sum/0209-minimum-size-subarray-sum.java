class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target && i<=j){
                len=Math.min(len,(j-i)+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
           
        }
        if(len==Integer.MAX_VALUE){
            return 0;
        }
        return len;
        
    }
}