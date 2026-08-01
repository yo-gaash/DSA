class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return subset(0,nums,ans,new ArrayList<>());
    }
    public static List<List<Integer>> subset(int start,int[] nums,List<List<Integer>> ans, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<=nums.length-1;i++){
            temp.add(nums[i]);
            subset(i+1,nums,ans,temp);
            temp.remove(temp.size()-1);
        }
        return ans;

    }
}