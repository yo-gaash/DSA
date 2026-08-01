class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int[] row:matrix){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<=row.length-1;i++){
                if(row[i]<min){
                    min=row[i];
                }
            }
            rowMin.add(min);
        }
        for(int i=0;i<=matrix[0].length-1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<=matrix.length-1;j++){
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            colMax.add(max);
        }
        for(int i=0;i<=rowMin.size()-1;i++){
            for(int j=0;j<=colMax.size()-1;j++){
                if(rowMin.get(i).equals(colMax.get(j))){
                    result.add(rowMin.get(i));
                    break;
                }
            }
        }
        return result;
    }
}