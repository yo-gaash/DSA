class Solution {
    public int findShortestSubArray(int[] nums) {
        int freq[] = new int[50001];
        int index[] = new int[50001];
        boolean visited[] = new boolean[50001];
        int max =0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            freq[i]++;
            max = Math.max(max,freq[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(freq[nums[i]] == max) index[nums[i]] = i;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(freq[nums[i]] == max && !visited[nums[i]]){
                min = Math.min(min, index[nums[i]]-i+1);
                visited[nums[i]] = true;
            }
        }
        if(min == Integer.MAX_VALUE) return 1;
        return min;

    }
}