class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int k=0;
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n){
            return mat;
        }
        int[] temp = new int[m*n];
        int[][] result = new int[r][c];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                temp[k] = mat[i][j];
                k++;
            }
        }
        int i=0,j=0;
        for(int val:temp){
            if(j>c-1){
                i++;
                j=0;
            }
            result[i][j]=val;
            j++;
        }
        return result;
    }
}