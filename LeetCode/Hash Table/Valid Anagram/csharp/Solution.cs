public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length!=t.Length){
            return false;
        }
        char[] sarr = s.ToCharArray();
        char[] tarr = t.ToCharArray();
        Array.Sort(sarr);
        Array.Sort(tarr);
        for(int i=0;i<=sarr.Length-1;i++){
            if(sarr[i]!=tarr[i]){
                return false;
            }
        }
        return true;
    }
}