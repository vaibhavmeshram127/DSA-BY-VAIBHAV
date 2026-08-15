class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;

        while(i<=j){
            int leftS=nums[i]*nums[i];
            int rightS=nums[j]*nums[j];

            if(leftS>rightS){
                ans[pos]=leftS;
                i++;
                pos--;
            }
            else{
                ans[pos]=rightS;
                j--;
                pos--;
            }

        }
        return ans;
    }
}