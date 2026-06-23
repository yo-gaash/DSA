class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int[] result = new int[accounts.length];
        for(int i=0;i<=accounts.length-1;i++){
            for(int j=1;j<=accounts[i].length-1;j++){
                accounts[i][j]+=accounts[i][j-1];
            }
        }
        for(int i=0;i<=result.length-1;i++){
            result[i] = accounts[i][accounts[i].length-1];
        }
        for(int temp:result){
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
}