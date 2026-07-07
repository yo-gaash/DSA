class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if(n==1){
            return false;
        }
        int start = 0;
        for(int end = 0;end<s.length()/2;end++){
            if(n%(end+1) == 0){
                String s1 = s.substring(start,end+1);
                System.out.println("Main String : "+s1);
                StringBuilder sb = new StringBuilder();
                for(int i=1;i<=n/(end+1);i++){
                    sb.append(s1);
                }
                System.out.println("Substring : "+sb.toString());
                if(s.equals(sb.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}