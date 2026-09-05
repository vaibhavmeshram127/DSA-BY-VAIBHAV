class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] left=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            left[i]=sum;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(left[i]==k){
                count++;

            }
            int l=i-1;
            
            while(l>=0){
                int temp=left[i];
                if(temp-left[l]==k){
                    count++;
                }
                l--;
            }
            
        }
        return count;
        



        
    }
}