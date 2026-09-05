class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            leftSum[i]=sum;
            sum=sum+nums[i];
        } 

        int[] rightSum=new int[nums.length];
        int rsum=0;
        for(int i=nums.length-1;i>=0;i--){
            rightSum[i]=rsum;
            rsum=rsum+nums[i];
        }  

        for(int i=0;i<nums.length;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;      
    }
}