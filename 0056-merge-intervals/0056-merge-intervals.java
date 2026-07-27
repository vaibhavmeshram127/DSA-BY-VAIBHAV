class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int S=intervals[i][0];
            int E=intervals[i][1];
            if(!ans.isEmpty() && E<=ans.get(ans.size()-1)[1]){
                continue;
            }

            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=E){
                    E=Math.max(E,intervals[j][1]);

                }
                else{
                    break;
                }

            }
            ans.add(new int[]{S,E});
        
        }
        return ans.toArray(new int[ans.size()][]);
        

        
    }
}