class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String t=tokens[i];
            if(t.matches("^-?[0-9]+$")){
                st.push(Integer.parseInt(tokens[i]));
            }
            else{
                int num1=st.pop();
                int num2=st.pop();
                if(t.equals("+")){
                    st.push(num2+num1);
                }
                else if(t.equals("-")){
                    st.push(num2-num1);
                }
                else if(t.equals("*")){
                    st.push(num2*num1);
                }
                else if(t.equals("/")){
                    st.push(num2/num1);
                }
            }
        }
        return st.pop();
        
    }
}