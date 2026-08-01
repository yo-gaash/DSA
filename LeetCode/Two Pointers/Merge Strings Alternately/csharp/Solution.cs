public class Solution {
    public string MergeAlternately(string word1, string word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<=word1.Length-1 || i<=word2.Length-1){
            if(i<=word1.Length-1){
                sb.Append(word1[i]);
            }
            if(i<=word2.Length-1){
                sb.Append(word2[i]);
            }
            i++;
        }
        return sb.ToString();
    }
}