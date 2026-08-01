class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        arrRev(nums,0,nums.length-1);        
        arrRev(nums,0,k-1);
        arrRev(nums,k,nums.length-1);
    }
    static void arrRev(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}