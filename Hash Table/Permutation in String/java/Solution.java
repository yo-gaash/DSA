class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<List<Character>> permutations = permute(s1);
        for(List<Character> list:permutations){
            StringBuilder sb = new StringBuilder();
            for(char ch:list){
                sb.append(ch);
            }
            if(s2.contains(sb)){
                return true;
            }
        }
        return false;
    }
    public static List<List<Character>> permute(String s1){
        List<List<Character>> ans = new ArrayList<>();
        if(s1.length()==1){
            ans.add(new ArrayList<>(Arrays.asList(s1.charAt(0))));
            return ans;
        }
        for(int i=0;i<=s1.length()-1;i++){
            char ch = s1.charAt(i);
            String remaining = s1.substring(0,i)+s1.substring(i+1);
            List<List<Character>> prems = permute(remaining);
            for(List<Character> p : prems){
                List<Character> curr =  new ArrayList<>();
                curr.add(ch);
                curr.addAll(p);
                ans.add(curr);
            }
        }
        return ans;
    }
}