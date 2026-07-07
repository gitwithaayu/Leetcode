class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        long tt=0;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
         while(low<=high){
         int mid=low+(high-low)/2;
         tt=0;
         for (int i = 0; i < nums.length; i++) {
            tt+=(int)Math.ceil((double)nums[i]/mid);
        }
        if(tt<=threshold){
            ans= mid;
            high=mid-1;
        }
        else
           low=mid+1;

         }
         return ans;
    }
}