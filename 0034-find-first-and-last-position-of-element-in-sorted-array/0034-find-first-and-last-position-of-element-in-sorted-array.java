class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int[] ans=new int[2];
        ans[0]=position(nums,target,true);
        ans[1]=position(nums,target,false);
        return ans;


        
    }
    public int position(int[] nums,int target,boolean val){
        int pos=-1;
        int start=0;
        int end=nums.length-1;
        

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                pos=mid;
                
                if(val){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        
        return pos;

    }
}