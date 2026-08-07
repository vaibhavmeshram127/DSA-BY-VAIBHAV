class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int p1=0;
        int p2=0;
        List<int[]> ans=new ArrayList<>();

        while(p1<firstList.length && p2<secondList.length){
            if(firstList[p1][1]<secondList[p2][0]){
                p1++;
            }
            else if(firstList[p1][0]>secondList[p2][1]){
                p2++;
            }
            else{
                int first=Math.max(firstList[p1][0],secondList[p2][0]);
                int second=Math.min(firstList[p1][1],secondList[p2][1]);
                ans.add(new int[]{first,second});
                if(firstList[p1][1]<secondList[p2][1]){
                    p1++;
                }else{
                    p2++;
                }
                
            }
        }
        return ans.toArray(new int[ans.size()][]);
        
    }
}