class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int front =0;
        int last =numbers.length-1;

        while(front<last){
            int sum=numbers[front]+numbers[last];
            if(sum<target){
                front++;
            }
            else if(sum>target){
                last--;
            }
            else{
                return new int[]{front+1,last+1};
            }
            
        }
        return new int[]{-1,-1};
    }
}