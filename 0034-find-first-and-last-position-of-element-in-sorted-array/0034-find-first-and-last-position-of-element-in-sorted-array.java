class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        arr[0]=helper(nums,target,true);
        arr[1]=helper(nums,target,false);

        return arr;

        
    }
    public int helper(int[] nums,int target,boolean value){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                ans=mid;
                if(value){
                   high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return ans ;
    }
}