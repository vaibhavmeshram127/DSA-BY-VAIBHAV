class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            if(height[left]<=height[right]){
                int width=right-left;
                int area=height[left]*width;
                if(area>max){
                    max=area;
                }
                left++;

            }
            else if(height[left]>height[right]){
                int width=right-left;
                int area=height[right]*width;
                if(area>max){
                    max=area;
                }
                right--;

            }

        }
        return max;
        
        
    }
}