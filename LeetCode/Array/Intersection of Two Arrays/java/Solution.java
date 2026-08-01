class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> dummy = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int num: nums1){
            dummy.add(num);
        }
        for(int num: nums2){
            if(dummy.contains(num)){
                result.add(num);
            }
        }
        int i=0;
        int[] ans = new int[result.size()];
        for(int num: result){
            ans[i++] = num;
        }
        return ans;
    }
}