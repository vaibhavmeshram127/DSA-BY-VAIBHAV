class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        
        int prod=1;
        int count=0;
        for(int j=0;j<nums.length;j++){
            prod=prod*nums[j];
            
            while(i<=j && prod>=k){
                prod=prod/nums[i];
                
                i++;
            }
        
            count=count+(j-i)+1;
            



        }
        return count;
        
    }
}