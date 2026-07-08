class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int ans=0;

        for (int i =0; i< weights.length; i++) {
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        while (low <= high) {
            int sum = 0;
            int d = 1;
            int mid = low + (high - low) / 2;
            for (int i =0; i< weights.length; i++) {
               sum+=weights[i];
                if(sum<=mid){
                continue;}
                d++;
                sum=0;
                i--;

        }
         if (d<=days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}