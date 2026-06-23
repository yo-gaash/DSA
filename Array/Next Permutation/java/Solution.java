class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        int nxtGreater = -1;
        if(breakPoint!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[breakPoint]){
                    nxtGreater = i;
                    break;
                }
            }
            swap(nums,breakPoint,nxtGreater);
            sort(nums,breakPoint+1);
        }
        else{
            int start = 0;
            int end = n-1;
            while(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void swap(int[]nums, int breakPoint,int nxtGreater){
        int temp = nums[breakPoint];
        nums[breakPoint] = nums[nxtGreater];
        nums[nxtGreater] = temp;
    }
    public static void sort(int[] nums,int idx){
        for(int i=idx;i<=nums.length-2;i++){
            if(nums[i]>nums[i+1]){
                swap(nums,i,i+1);
            }
        }
    }
}