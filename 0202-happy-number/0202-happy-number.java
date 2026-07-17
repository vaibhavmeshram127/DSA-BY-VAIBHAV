class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
            if(slow==1 || fast==1){
                return true;
            }

        }while(fast!=slow);

        return false;
        
        
    }
    public  int square(int n){
        int prod=0;
        while(n>0){
            int rem=n%10;
            prod=prod+rem*rem;
            n=n/10;
            

        }
        return prod;
    }
}