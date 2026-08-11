class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>result=new ArrayList<>();
        int[]newInterval=intervals[0];
        result.add(newInterval);
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];
            if(newInterval[1]>=interval[0]){
             newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                result.add(newInterval);
            }

        }
         return result.toArray(new int[result.size()][]);
        
    }

}