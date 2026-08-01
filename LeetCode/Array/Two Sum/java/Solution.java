class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        for(i=0;i<=nums.length-2;i++){
            for(j=i+1;j<=nums.length-1;j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}