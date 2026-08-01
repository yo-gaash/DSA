class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int currIndex = 0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=currIndex;j>index[i];j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
            currIndex++;
        }
        return target;
    }
}