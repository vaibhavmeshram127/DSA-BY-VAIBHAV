class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[idx-1]==nums[i]){
                continue;
            }else{
                nums[idx]=nums[i];
                idx++;

            }
        }
        return idx;

        

        
    }
}