class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stackpse=new Stack<>();
        int[] arrpse=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!stackpse.isEmpty() && heights[stackpse.peek()]>=heights[i]){
                stackpse.pop();
            }
            if(stackpse.isEmpty()){
                arrpse[i]=-1;
                
            }else{
                arrpse[i]=stackpse.peek();
            }
             stackpse.push(i);

        }
        Stack<Integer>stacknse=new Stack<>();
        int[] arrnse=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!stacknse.isEmpty() && heights[stacknse.peek()]>=heights[i]){
                stacknse.pop();
            }
            if(stacknse.isEmpty()){
                arrnse[i]=heights.length;
                
            }else{
                arrnse[i]=stacknse.peek();
            }
             stacknse.push(i);
        }
        int area=0;
        int max=0;
        for(int i=0;i<heights.length;i++){
        max= heights[i]*(arrnse[i]-arrpse[i]-1);
        area=Math.max(area,max);

    }

return area;
}
}