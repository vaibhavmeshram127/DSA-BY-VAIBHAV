class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftp= new int[nums.length];
        leftp[0]=1;
        int productL=nums[0];
        for(int i=1;i<nums.length;i++){
            leftp[i]=productL;
            productL=productL*nums[i];

        }
        int[] rightp=new int[nums.length];
        rightp[nums.length-1]=leftp[nums.length-1];
        int productR=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightp[i]=productR*leftp[i];
            productR=productR*nums[i];

        }
        return rightp;
        

    }
}