class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int count = solve(nums, target, 0, 0);
        return count;
    }
    public static int solve(int[] nums, int target, int start, int currentSum){
        if(start == nums.length){
            if(currentSum==target){
                return 1;
            }
            return 0;
        }
        int positive = 0 ;
        positive+=solve(nums,target,start+1,currentSum+nums[start]);
        int negative = 0;
        negative+=solve(nums,target,start+1,currentSum-nums[start]);
        return positive+negative;
    }
}