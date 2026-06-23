class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> indices = new HashMap<>();
        for(int i=0;i<=nums.length-1;i++){
            if(indices.containsKey(nums[i])){
                int idx = indices.get(nums[i]);
                if(Math.abs(i-idx)<=k){
                    return true;
                }
            }
            indices.put(nums[i],i);
        } 
        return false;
    }
}