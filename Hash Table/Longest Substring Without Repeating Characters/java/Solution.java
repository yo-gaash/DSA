class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()==0){
        //     return 0;
        // }
        Set<Character> max = new HashSet<>();
        int start = 0;
        //int maxLength = Integer.MIN_VALUE;
        int maxLength = 0;
        for(int end=0;end<=s.length()-1;end++){
            while(!max.isEmpty()&&max.contains(s.charAt(end))){
                System.out.println("Removed: "+s.charAt(start)+" "+start);
                max.remove(s.charAt(start));
                start++;
            }
            max.add(s.charAt(end));
            System.out.println("Added: "+s.charAt(end)+" "+end);
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}