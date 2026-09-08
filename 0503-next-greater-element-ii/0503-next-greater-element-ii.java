class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st=new Stack<>();
        int[] ans =new int[nums.length];
        for(int i=2*nums.length-1;i>=nums.length;i--){
            while(!st.isEmpty() && nums[i%nums.length]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(nums[i%nums.length]);
            }else{
                st.push(nums[i%nums.length]);
            }


        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                
                ans[i]=-1;
                st.push(nums[i]);
            }else{
                ans[i]=st.peek();
                st.push(nums[i]);
            }


        }
        return ans;
    }
}