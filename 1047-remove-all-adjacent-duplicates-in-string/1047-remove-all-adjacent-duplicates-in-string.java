class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek()==ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }

            }
            else{
                st.push(ch);
            }
        }
        String newS="";
        while(!st.isEmpty()){
            newS=newS+st.pop();
            
        }

        String reverse="";
        for(int i=newS.length()-1;i>=0;i--){
            reverse=reverse+newS.charAt(i);
        }
        return reverse;
        
    }
}