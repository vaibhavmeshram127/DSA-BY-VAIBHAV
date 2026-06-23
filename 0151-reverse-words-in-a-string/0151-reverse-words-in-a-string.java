class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String ans="";
        int j=str.length()-1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                if(i<str.length()-1 && str.charAt(i+1)!=' '){
                   
                    ans=ans+str.substring(i+1,j+1);

                    ans+=" ";

                }
                if(i>0 && str.charAt(i-1) !=' '){
                    j=i-1;
                }
                
            }
            if(i==0){
                ans=ans+str.substring(i,j+1);
            }

        }
        return ans ;

        
    }
}