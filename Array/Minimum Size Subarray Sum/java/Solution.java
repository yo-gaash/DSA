class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int end=0;end<=nums.length-1;end++){
            sum = sum+nums[end];
            System.out.println("Adding : "+nums[end]+" "+sum);
            while(sum>=target){
                minLength = Math.min(minLength,end-start+1);
                System.out.print("Removing: "+nums[start]);
                sum = sum-nums[start];
                start++;
                System.out.println(" "+sum);
            }
        }
        return minLength == Integer.MAX_VALUE?0:minLength;
    }
}