class Solution {
    public int maxProduct(int[] nums) {

        int leftp=1;
        int leftMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            leftp=leftp*nums[i];
            leftMax=Math.max(leftp,leftMax);
            if(leftp==0){
                leftp=1;
            }

        }
        
        
        int rightp=1;
        int rightMax=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            rightp=rightp*nums[i];
            rightMax=Math.max(rightp,rightMax);
            if(rightp==0){
                rightp=1;
            }

        }
        return Math.max(leftMax,rightMax);
        
    }
}