public class Solution {
    public int StrStr(string haystack, string needle) {
        int haystackLen = haystack.Length;
        int needleLen = needle.Length;
        if(haystackLen < needleLen){
            return -1;
        }
        for(int i=0;i<=haystackLen-needleLen;i++){
            if(haystack.Substring(i,needleLen).Equals(needle)){
                return i;
            }
        }
        return -1;
    }
}