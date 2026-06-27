class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr= new int[nums.length];
        leftArr[0]=1;
        int leftP=1;
        for(int i=1;i<nums.length;i++){
            
            leftP=leftP*nums[i-1];
            leftArr[i]=leftP;

        }
        int rightP=1;
        for(int i=nums.length-2;i>=0;i--){
            rightP=rightP*nums[i+1];
            leftArr[i]=rightP*leftArr[i];

        }
        return leftArr;
    }
}