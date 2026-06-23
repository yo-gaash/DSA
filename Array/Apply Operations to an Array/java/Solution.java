class Solution {
    public int[] applyOperations(int[] nums) {
        int i,j,n = nums.length;
        for(i=0,j=i+1;i<n-1;i++,j++){
            if(nums[i] == nums[j]){
                nums[i] = nums[i]*2;
                nums[j] = 0;
            }
        }
        for(i=0;i<n-1;i++){
            j=i;
            if(nums[j]==0 && nums[i+1]!=0){
                nums[j] = nums[j+1];
                nums[j+1] = 0;
                j++;
            }
        }
        return nums;
    }
}