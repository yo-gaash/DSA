class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = subset(new ArrayList<>(), nums);
        return ans;
    }
    public static List<List<Integer>> subset(List<Integer> p, int[] up){
        if(up.length==0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }
        int num = up[0];
        int[] remaining = new int[up.length-1];
        int idx = 0;
        for(int i=1;i<=up.length-1;i++){
            remaining[idx++] = up[i];
        }
        p.add(num);
        List<List<Integer>> left = subset(p,remaining);
        p.remove(p.size()-1);
        List<List<Integer>> right = subset(p,remaining);
        left.addAll(right);
        return left;
    }
}