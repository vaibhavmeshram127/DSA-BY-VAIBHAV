class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int len=Integer.MIN_VALUE;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==0){
                len=Math.max(len,i+1);
            }
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
   
            }
            else{
                map.put(sum,i);
            }
        }
        if(len==Integer.MIN_VALUE){
            return 0;
        }
        return len;
       

        
        
    }
}