public class Solution {
    public char FindTheDifference(string s, string t) {
        char[] sarr = s.ToCharArray();
        char[] tarr = t.ToCharArray();
        Array.Sort(sarr);
        Array.Sort(tarr);
        Console.WriteLine(sarr);
        Console.WriteLine(tarr);
        int i = 0;
        int length = 0;
        while(length<=s.Length-1){
            if(sarr[i]!=tarr[i]){
                return tarr[i];
            }
            i++;
            length++;
        }
        return tarr[tarr.Length-1];;
    }
}