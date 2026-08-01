class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
        for(int i=0;i<=indices.length-1;i++){
            for(int j=0;j<=1;j++){
                int temp = indices[i][j];
                if(j==0){
                    for(int col=0;col<=n-1;col++){
                        result[temp][col]++;
                    }
                }
                else{
                    for(int row=0;row<=m-1;row++){
                        result[row][temp]++;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                if(result[i][j]%2!=0){
                    count++;
                }
            }    
        }
        return count;
    }
}