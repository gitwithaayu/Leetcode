class Solution {
    public int maxArea(int[] height) {
       int maxh=height[0];
       int l=0;
       int r=height.length-1;
       int maxarea = 0,area=0;
       while(l<r){
        area=(Math.min(height[r],height[l])*(r-l));
        maxarea=Math.max(area,maxarea);
        if(height[r]>=height[l])
           l++;
        else
            r--;
        
    }
    return maxarea;
}

}


        