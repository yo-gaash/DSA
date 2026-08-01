class Solution {
    public boolean detectCapitalUse(String word) {
        int uCount = 0,lCount = 0, first = 0;
        if(Character.isUpperCase(word.charAt(0))){
            first++;
        }
        else{
            lCount++;
        }
        for(int i=1;i<=word.length()-1;i++){
            if(Character.isUpperCase(word.charAt(i))){
                uCount++;
            }
            else{
                lCount++;
            }
        }
        if((first==1&&lCount==word.length()-1)||(first==1&&uCount==word.length()-1)||lCount==word.length()){
            return true;
        }
        else {
            return false;
        }
    }
}