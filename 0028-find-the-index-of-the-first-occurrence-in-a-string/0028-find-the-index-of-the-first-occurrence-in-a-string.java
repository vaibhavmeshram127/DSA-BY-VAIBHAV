class Solution {
    public int strStr(String haystack, String needle) {
        int start=0;
        int end=needle.length();
        for(int i=0;i<haystack.length();i++){
            if(end<=haystack.length()){
                if(haystack.substring(start,end).equals(needle)){
                    return start;
                }
            }else{
                break;
            }
            start++;
            end++;

        }
        return -1;
        
    }
}