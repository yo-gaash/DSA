class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i=-1;
        for(int j=0;j<=length-1;j++){
            if(nums[j]==0){
                i=j;
                break;
            }
        }
        if(i!=-1){
            for(int j=i+1;j<=length-1;j++){
                if(nums[j]!=0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
            }
        }
    }
}