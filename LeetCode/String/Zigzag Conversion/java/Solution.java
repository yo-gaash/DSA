class Solution {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        if(numRows<=1){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<=numRows-1;i++){
            rows[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean increase = false;
        for(char ch:chars){
            rows[currRow].append(ch);
            if(currRow==0||currRow==numRows-1){
                increase = !increase;
            }
            if(increase){
                currRow++;
            }
            else{
                currRow--;
            }

        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }
        return result.toString();
    }
}