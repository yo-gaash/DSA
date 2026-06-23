class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] parts = s.split(" ");
        String[] result = new String[parts.length];
        for(String word:parts){
            int pos = word.charAt(word.length()-1)-'1';
            result[pos] = word.substring(0,word.length()-1);
        }
        for(String word : result){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}