class Solution {
    public int search(int[] nums, int target) {
        int peak = findPeakElement(nums);
        if(peak == -1){
            return binarySearch(nums,0,nums.length-1,target);
        }
        int index = binarySearch(nums,0,peak,target);
        if(index == -1){
            index = binarySearch(nums,peak+1,nums.length-1,target);
        }
        return index;
    }

    public static int findPeakElement(int nums[]){
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid < end && nums[mid]>nums[mid + 1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end = mid-1;
            }
            else if(nums[start]<nums[mid]){
                start = mid +1;
            }
        }
        return -1;
    }    

        public static int binarySearch(int nums[] , int start , int end , int target){
            while(start<=end){
            int mid = start+(end - start)/2;
            if(target < nums[mid]){
              end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
            }
            return -1;
        }
}