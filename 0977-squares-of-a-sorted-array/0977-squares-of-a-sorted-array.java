class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr =new int[nums.length];
        int idx=nums.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int iSquare=nums[i]*nums[i];
            int jSquare=nums[j]*nums[j];
            if(iSquare<jSquare){
                arr[idx]=jSquare;
                j--;
                idx--;
                
            }else{
                arr[idx]=iSquare;
                i++;
                idx--;
            }
        }
        return arr;
        
    }
}