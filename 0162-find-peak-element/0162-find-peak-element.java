class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if( mid>0 && nums[mid-1]>nums[mid]){
                right--;
            }
            else if(mid<nums.length-1 && nums[mid+1]>nums[mid]){
                left++;
            }else{
                return mid;
            }
        }
        return -1;
        
    }
}