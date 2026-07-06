class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int ans=0;
        int low=0,high=nums.length-1;
        if(nums[high]<target){
            return high+1;
        }
        while(low<=high){
           int mid=low+(high-low)/2;
           if(nums[mid]>=target){
            ans=mid;
            high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return ans;
    
    }
    
}     