class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), ans);
        return ans;

    }
    public static void subset(int start, int[] nums, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<=nums.length-1;i++){
            temp.add(nums[i]);
            subset(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}