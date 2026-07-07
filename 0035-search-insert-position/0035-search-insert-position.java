class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
                index=left;
            }else{
                right=mid-1;
                index=left;
            }
        }
        return index;
       
        
    }
}