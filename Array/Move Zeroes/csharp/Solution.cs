public class Solution {
    public void MoveZeroes(int[] nums) {
        int zeroIdx = 0;
        for(int i=0;i<=nums.Length-1;i++){
            if(nums[i]==0){
                zeroIdx = i;
                break;
            }
        }
        Console.WriteLine(zeroIdx);
        int j = zeroIdx+1;
        while(j<=nums.Length-1){
            if(nums[j]!=0){
                swap(zeroIdx,j,nums);
                zeroIdx++;
                j++;
            }
            else{
                j++;
            }
        }
    }
    public static void swap(int idx1, int idx2, int[] nums){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}