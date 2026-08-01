class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int even=0, odd=length-1;
        for(int num:nums){
            if(num%2==0){
                ans[even]=num;
                even++;
            }
            else{
                ans[odd]=num;
                odd--;
            }
        }
        return ans;
    }
}