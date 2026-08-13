class Solution {
    public String getPermutation(int n, int k) {
        String num = "";
        for(int i=1;i<=n;i++){
            num+=i;
        }
        List<String> ans = permute(num,0,k);
        return ans.get(k-1);
    }
    public static List<String> permute(String num, int count, int k){
        List<String> ans = new ArrayList<>();
        if(count == k){
            return ans;
        }
        if(num.length() == 1){
            ans.add(num);
            return ans;
        }
        for(int i=0;i<=num.length()-1;i++){
            char ch = num.charAt(i);
            String remaining = num.substring(0,i)+num.substring(i+1);
            List<String> perms = permute(remaining,count, k);
            for(String p : perms){
                ans.add(ch+p);
                count++;
            }
        }
        return ans;
    }
}