class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int hei = Math.min(height[start],height[end]);
            int width = end-start;
            int area = hei*width;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }

}