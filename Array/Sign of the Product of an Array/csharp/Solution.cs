public class Solution {
    public int ArraySign(int[] nums) {
        int negCount = 0;
        for(int i=0;i<=nums.Length-1;i++){
            if(nums[i]==0){
                return 0;
            }
            else{
                if(nums[i]<0){
                    negCount++;
                }
            }
        }
        if(negCount%2!=0){
            return -1;
        }
        return 1;
    }
}