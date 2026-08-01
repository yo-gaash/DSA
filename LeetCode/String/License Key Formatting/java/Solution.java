class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        StringBuilder result = new StringBuilder();
        System.out.println(sb.length());
        int temp = 0;
        for(int i=sb.length()-1;i>=0;i--){
            result.append(sb.charAt(i));
            temp++;
            if(temp==k&&i!=0){
                result.append("-");
                temp = 0;
            }
        }
        System.out.println(result.toString());
        //System.out.println(result.reverse().toString());
        return result.reverse().toString().toUpperCase();
    }
}