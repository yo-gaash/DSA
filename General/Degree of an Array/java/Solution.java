1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        int freq[] = new int[50001];
4        int index[] = new int[50001];
5        boolean visited[] = new boolean[50001];
6        int max =0;
7        int min = Integer.MAX_VALUE;
8        for(int i : nums){
9            freq[i]++;
10            max = Math.max(max,freq[i]);
11        }
12        for(int i = 0 ; i < nums.length ; i++){
13            if(freq[nums[i]] == max) index[nums[i]] = i;
14        }
15        for(int i = 0 ; i < nums.length ; i++){
16            if(freq[nums[i]] == max && !visited[nums[i]]){
17                min = Math.min(min, index[nums[i]]-i+1);
18                visited[nums[i]] = true;
19            }
20        }
21        if(min == Integer.MAX_VALUE) return 1;
22        return min;
23
24    }
25}