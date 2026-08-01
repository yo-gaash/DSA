class Solution {
    public int subarraySum(int[] nums, int k) {
        int length = nums.length;
        int[] prefixSum = new int[length+1];
        for(int i=0;i<=length-1;i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        int count = 0;
        for(int i=0;i<=prefixSum.length-2;i++){
            for(int j=i+1;j<=prefixSum.length-1;j++){
                if((prefixSum[j]-prefixSum[i])==k){
                    count++;
                }
            }
        }
        return count;
    }
}