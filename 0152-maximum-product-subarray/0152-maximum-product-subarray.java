class Solution {
    public int maxProduct(int[] nums) {
        
        int f=1;
        int b=1;
        int maxf=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            f=f*nums[i];
          
            maxf=Math.max(f,maxf);
            if(f==0){
                f=1;
            }

        }
        int maxb=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            b=b*nums[i];
            maxb=Math.max(maxb,b);
            if(b==0){
                b=1;
            }
        }
        return Math.max(maxf,maxb);
    }
}