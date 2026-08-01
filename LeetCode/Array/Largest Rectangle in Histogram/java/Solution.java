class Solution {
    public int largestRectangleArea(int[] heights) {
        // int height = 0;
        // int width = 0;
        // int area = 0;
        int maxArea = 0;
        int currentheight=0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=heights.length;i++){
             currentheight = (i==n)?0:heights[i];
            while(!stack.isEmpty()&&currentheight<heights[stack.peek()]){
               int height = heights[stack.pop()];
                int width = stack.isEmpty()?i:i-stack.peek()-1;
               int  area = height*width;
                maxArea = Math.max(maxArea,area); 
            }
            stack.push(i);
        }
        return maxArea;
    }
}