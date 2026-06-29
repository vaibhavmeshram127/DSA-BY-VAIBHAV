class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost){
            return -1;
        }
        int fuel=0;
        int starting=0;
        for(int i=0;i<gas.length;i++){
            fuel=fuel+gas[i]-cost[i];
            if(fuel<0){
                fuel=0;
                starting=i+1;
            }
           

        }
        return starting;






       

        
    }
}