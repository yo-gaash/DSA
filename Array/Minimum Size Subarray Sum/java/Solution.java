class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] prefixSum = new int[nums.length+1];
        for(int i=0;i<=nums.length-1;i++){
            prefixSum[i+1] = prefixSum[i]+nums[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=prefixSum.length-2;i++){
            for(int j=i+1;j<=prefixSum.length-1;j++){
                if(prefixSum[j]-prefixSum[i]>=target){
                    min = Math.min(min,j-i);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            min = 0;
        }
        return min;
    }
}