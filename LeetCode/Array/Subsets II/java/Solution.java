class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        subsets(0,nums,result,new ArrayList<>());
        return result;
    }
    public static List<List<Integer>> subsets(int start, int[] nums, List<List<Integer>> result, List<Integer> curr){
        if(!result.contains(curr)){
            result.add(new ArrayList<>(curr));
        }
        for(int i=start;i<=nums.length-1;i++){
            curr.add(nums[i]);
            subsets(i+1,nums,result,curr);
            curr.remove(curr.size()-1);
        }
        return result;
    }
}