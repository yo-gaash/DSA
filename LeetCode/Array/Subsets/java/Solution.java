class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recurse(0,nums,result,new ArrayList<>());
        return result;
    }
    public static void recurse(int start, int[] nums, List<List<Integer>> result,List<Integer> curr){
        result.add(new ArrayList<>(curr));
        for(int i=start;i<=nums.length-1;i++){
            curr.add(nums[i]);
            recurse(i+1,nums,result,curr);
            curr.remove(curr.size()-1);
        }
    }
}