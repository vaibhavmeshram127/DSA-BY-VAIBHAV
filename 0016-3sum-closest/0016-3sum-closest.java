class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closet=Integer.MAX_VALUE;
        int dif=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return target;
                }
                else{
                    if(sum>target){
                        int abb=sum-target;
                        if(abb<=dif){
                            dif=abb;
                            closet=sum;
                        }
                        
                        k--;

                    }
                    else{
                        int abb=Math.abs(target-sum);
                        if(abb<dif){
                            dif=abb;
                            closet=sum;
                        }
                       
                        j++;
                    }

                }
            }
           

            
        }
        return closet;
        
        
    }
}