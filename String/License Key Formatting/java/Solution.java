class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int idx = s.indexOf('-');
        int count = 0;
        for(int i=idx+1;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<=idx;i++){
            ans.append(s.charAt(i));
        }
        int j=0;
        for(int i=idx;i<=sb.length()-1;i++){
            if(j==k){
                ans.append('-');
                j=0;
            }
            ans.append(sb.charAt(i));
            j++;
        }
        //System.out.println(ans.toString());
        return ans.toString().toUpperCase();
    }
}