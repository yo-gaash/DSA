class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i=0;i<=nums.length-1;i++){
            if(i%2==0){
                arr[i] = nums[index];
                index++;
            }
            else {
                arr[i] = nums[n];
                n++;
            }
        }
        return arr;
    }
}