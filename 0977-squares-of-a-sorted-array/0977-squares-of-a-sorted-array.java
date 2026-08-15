class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*nums[i];
            }else{
                nums[i]=nums[i]*nums[i];
            }
        }
        Arrays.sort(nums);
        return nums;

        
    }
}