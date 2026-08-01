class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length==1){
            ans.add(Arrays.asList(nums[0]));
            return ans;
        }
        for(int i=0;i<=nums.length-1;i++){
            int num = nums[i];
            int[] remaining = new int[nums.length-1];
            int idx = 0;
            for(int j=0;j<=nums.length-1;j++){
                if(j!=i){
                    remaining[idx++] = nums[j];
                }
            }
            List<List<Integer>> prems = permuteUnique(remaining);
            for(List<Integer> p:prems){
                List<Integer> curr = new ArrayList<>();
                curr.add(num);
                curr.addAll(p);
                if(!ans.contains(curr)){
                    ans.add(curr);
                }
            }
        }
        return ans;
    }
}