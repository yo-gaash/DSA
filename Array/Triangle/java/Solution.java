class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp = new int[len][len];
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1;i<len;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j] = triangle.get(i).get(j)+dp[i-1][j];
                }
                else if(j==i){
                    dp[i][j] = triangle.get(i).get(j)+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = triangle.get(i).get(j)+Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<len;j++){
            min = Math.min(dp[len-1][j],min);
        }
        return min;
    }
}