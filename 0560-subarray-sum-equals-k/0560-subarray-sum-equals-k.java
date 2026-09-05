class Solution {
    public int subarraySum(int[] nums, int k) {
       
        int sum=0;
        int count=0; 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==k){
                count++;
            }

            int soln=sum-k;

            if(map.containsKey(soln)){
                int c=map.get(soln);
                count=count+c;
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);

            }else{
                map.put(sum,1);
            }


        }
        return count ;
       
        



        
    }
}