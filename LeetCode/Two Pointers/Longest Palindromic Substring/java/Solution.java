class Solution {
    public String longestPalindrome(String s) {
        int maxLen = Integer.MIN_VALUE;
        String palindromicString = "";
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i;j<=s.length()-1;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    int length = s.substring(i,j+1).length()-1;
                    if(length>maxLen){
                        maxLen = length;
                        palindromicString = s.substring(i,j+1);
                    }
                }
            }
        }
        return palindromicString;
    }
    public static boolean isPalindrome(String string){
        int left = 0;
        int right = string.length()-1;
        while(left<=right){
            if(string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}