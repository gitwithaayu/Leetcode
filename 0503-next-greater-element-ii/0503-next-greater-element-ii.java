class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
         int[] ans = new int[n];
        
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            int currele=nums[ind];
            while(!stack.isEmpty() && stack.peek()<=currele){
            stack.pop();
        }
        if(i<n){
            if(stack.isEmpty()){
                ans[ind]=-1;
            }
            else{
                 ans[ind]=stack.peek();

            }
        }
        stack.push(currele);
    
}
return ans;





        
    }
}