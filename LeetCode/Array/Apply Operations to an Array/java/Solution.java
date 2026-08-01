class Solution {
    public int[] applyOperations(int[] nums) {
int i,j,n = nums.length;
        for(i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        i=0;
        j=i+1;
        while(j<n){
            if(nums[i]==0 && nums[j]!=0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        return nums;
    }
}