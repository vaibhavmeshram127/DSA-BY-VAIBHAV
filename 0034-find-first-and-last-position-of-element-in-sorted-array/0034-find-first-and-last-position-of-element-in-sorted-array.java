class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=helper(nums,target,true);
        ans[1]=helper(nums,target,false);
        return ans;
        
    }
    public int helper(int[] nums,int target,boolean key){
        int left=0;
        int right=nums.length-1;
        int min=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                min=mid;
                if(key){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            else if(nums[mid]<target){
                left=mid+1;
                
            }else{
                right=mid-1;
            }
        }
        return min;
    }
}