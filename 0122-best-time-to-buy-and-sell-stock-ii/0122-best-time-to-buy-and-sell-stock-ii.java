class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int selling=prices[i]-buy;
                if(i<prices.length-1){
                    if(prices[i]<prices[i+1]){
                        buy=prices[i];
                    }
                    else{
                        buy=prices[i+1];
                    }    
                }
                  
                
                

                profit+=selling;
            } 
        }
        return profit;

        
    }
}