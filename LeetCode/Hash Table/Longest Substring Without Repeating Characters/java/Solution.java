class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subString = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLen = Integer.MIN_VALUE;
        while(end<=s.length()-1){
            while(subString.contains(s.charAt(end))){
                subString.remove(s.charAt(start));
                start++;
            }
            if(subString.isEmpty()||!subString.contains(s.charAt(end))){
                subString.add(s.charAt(end));
                maxLen = Math.max(maxLen,end-start+1);
                end++;
            }
        }
        maxLen = maxLen==Integer.MIN_VALUE?0:maxLen;
        return maxLen;
    }
}