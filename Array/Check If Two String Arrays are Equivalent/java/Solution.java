class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for(String word:word1){
            result1 = result1.append(word);
        }
        for(String word:word2){
            result2 = result2.append(word);
        }
        String ans1 = result1.toString();
        String ans2 = result2.toString();
        if(ans1.equals(ans2)){
            return true;
        }
        return false;
    }
}