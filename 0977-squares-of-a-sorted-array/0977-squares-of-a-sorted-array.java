class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;
        while(i<=j){
            int leftSquare=nums[i]*nums[i];
            int rightSquare=nums[j]*nums[j];
            if(leftSquare>rightSquare){
                ans[pos]=leftSquare;
                pos--;
                i++;

            }else{
                ans[pos]=rightSquare;
                pos--;
                j--;

            }


        }
        return ans;
    }
}