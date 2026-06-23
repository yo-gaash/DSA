class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==0){
            return mat[0][0];
        }
        int sum=0;
        for(int i=0;i<=mat.length-1;i++){
            int row=0,col=mat.length-1;
            for(int j=0;j<=mat.length-1;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
                else if(i==col&&j==row){
                    sum=sum+mat[i][j];
                }
                col--;
                row++;
            }
        }
        return sum;
    }
}