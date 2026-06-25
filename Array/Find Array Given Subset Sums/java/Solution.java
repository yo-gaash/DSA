class Solution {
    public int[] recoverArray(int n, int[] sums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(sums);
        for(int num : sums){
            list.add(num);
        }
        List<Integer> res = new ArrayList<>();
        res.add(recurse(list));
        int[] ans = new int[n];
        for(int i=0;i<=res.size()-1;i++){
            ans[0] = res.get(i);
        }
        return ans;
    }
    public static int recurse(List<Integer> list){
        List<Integer> groupA = new ArrayList<>();
        List<Integer> groupB = new ArrayList<>();
        int diff = list.get(list.size()-1)-list.get(list.size()-2);
        if(groupA.size()==1||groupB.size()==1){
            if(groupA.contains(0)){
                return diff;
            }
            else{
                return -1*diff;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int smallest = list.get(0);
        int pair = diff-smallest;
        groupA.add(smallest);
        groupB.add(pair);
        list.remove(Integer.valueOf(smallest));
        list.remove(Integer.valueOf(pair));
        System.out.print(groupA);
        System.out.print(groupB);
        if(groupA.contains(0)){
            ans.add(recurse(groupA));
        }
        else{
            ans.add(recurse(groupB));
            diff = -diff;
        }
        return diff;
    }
}