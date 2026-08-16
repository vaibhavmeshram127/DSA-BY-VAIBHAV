class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int max=nums[0];
        int wrongp1=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]<max){
                wrongp1=i;
            }

        }
        int wrongp2=-1;
        int min=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            if(nums[i]>min){
                wrongp2=i;
            }

        }
        if(wrongp1==-1 || wrongp2==-1){
            return 0;
        }

        return (wrongp1-wrongp2)+1;
        
    }
}