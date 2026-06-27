class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1=m-1;
        int idx2=n-1;
        int ans=nums1.length-1;
        while(idx1>=0 && idx2>=0){
            if(nums1[idx1]>nums2[idx2]){
                nums1[ans]=nums1[idx1];
                idx1--;
                ans--;
            }
            else{
                nums1[ans]=nums2[idx2];
                idx2--;
                ans--;
            }
        }
        while(idx1>=0){
            nums1[ans]=nums1[idx1];
            idx1--;
            ans--;

        }
        while(idx2>=0){
            nums1[ans]=nums2[idx2];
            idx2--;
            ans--;

        }
        

        
    }
}