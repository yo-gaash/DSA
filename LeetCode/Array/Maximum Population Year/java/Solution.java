class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051];
        for(int[] log:logs){
            years[log[0]] += 1;
            years[log[1]] += -1;
        }
        int year=0,max=0;
        for(int i=1;i<=years.length-1;i++){
            years[i]+=years[i-1];
            if(years[i]>max){
                max = years[i];
                year = i;
            }
        }
        return year;
    }
}