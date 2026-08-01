class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for(int num:nums){
            arrSum = arrSum + num;
        }
        int num = sum - arrSum;
        return num;
    }
}