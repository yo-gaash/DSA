class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        String word1 = s.substring(0,length/2);
        String word2 = s.substring(length/2,length);
        int result1 = occurence(word1);
        int result2 = occurence(word2);
        if(result1==result2){
            return true;
        }
        return false;

    }
    public static int occurence(String word){
        int count=0;
        char[] arr = word.toCharArray();
        for(char letter : arr){
            switch(letter){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    count++;
                    break;
                default :
                    continue;
            }
        }
        return count;
    }
}