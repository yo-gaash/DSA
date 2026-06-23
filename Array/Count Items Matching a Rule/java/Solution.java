class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = findkey(ruleKey);
        int count = 0;
        for(int i=0;i<=items.size()-1;i++){
            if(ruleValue.equals(items.get(i).get(j))){
                count++;
            }
        }
        return count;
    }
    public int findkey(String ruleKey){
        if(ruleKey.equals("type")){
            return 0;
        }
        if(ruleKey.equals("color")){
            return 1;
        }
        return 2;
    }
}