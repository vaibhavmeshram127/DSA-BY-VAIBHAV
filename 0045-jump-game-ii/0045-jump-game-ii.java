class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }


        int step=0;
        int curr=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]+i);

            if(i==curr){
                curr=max;
                step++;
            }
            if(curr>=nums.length-1){
                return step;
            }

        }
        return 0;
        
    } 
}   