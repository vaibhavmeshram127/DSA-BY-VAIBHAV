class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalans= new ArrayList<>();
      

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int ans=nums[i]+nums[j]+nums[k];
                if(ans<0){
                    j++;
                }else if(ans>0){
                    k--;
                }else{
                    List<Integer> triplet=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                    finalans.add(triplet);
                
                }
            }
        }   
        return finalans; 



        
    }
}