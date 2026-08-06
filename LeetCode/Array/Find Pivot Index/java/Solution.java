class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            int num = nums[i];
            int leftSum = sum(nums,0,i);
            int rightSum = sum(nums,i+1,nums.length);
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int[] nums, int left, int right){
        int sum = 0;
        for(int i=left;i<=right-1;i++){
            sum+=nums[i];
        }
        return sum;
    }
}