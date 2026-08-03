class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<target&&nums[i+1]>target)
            {
                return i+1;
            }
        }
        if(nums[0]>target)
        {
            return 0;
        }
        return nums.length;
    }
}