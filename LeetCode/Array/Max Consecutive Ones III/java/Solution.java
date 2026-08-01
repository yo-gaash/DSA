class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        //int zero = 0;
        while(end<=nums.length-1){
            if(nums[end]==0){
                k--;
            }
            while(k<0){
                if(nums[start]==0){
                    start++;
                    k++;
                }else{
                    start++;
                }
            }
            
                int len = end-start+1;
                maxLen = Math.max(maxLen,len);
            
            
            end++;
        }
        if(maxLen==Integer.MIN_VALUE){
            maxLen = 0;
        }
        return maxLen;
    }
}