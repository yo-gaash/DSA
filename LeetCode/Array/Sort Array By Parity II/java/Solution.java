class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left =0;
        int right = 1;
        //int j =0;
        int ans[] = new int[nums.length];
        for(int i =0; i<nums.length;i++){
            if(nums[i]%2==0){
                ans[left] = nums[i]; 
                left = left + 2;
            }
            else{
               ans[right] = nums[i];
               right = right + 2;
            }
        }
        return ans;
        
    }
}