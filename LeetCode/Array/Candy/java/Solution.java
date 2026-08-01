class Solution {
    public int candy(int[] ratings) {
        int[] result1 = new int[ratings.length];
        int[] result2 = new int[ratings.length];
        int[] max = new int[ratings.length];
        int candies = 0;
        result1[0] = 1;
        for(int i=1;i<=ratings.length-1;i++){
            if(ratings[i]>ratings[i-1]){
                result1[i] = result1[i-1]+1;
            }
            else{
                result1[i] = 1;                                                  
            }
        }
        result2[ratings.length-1] = 1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                result2[i] = result2[i+1]+1;
            }
            else{
                result2[i] = 1;
            }
        }
        for(int i=0;i<=ratings.length-1;i++){
            max[i] = Math.max(result1[i],result2[i]);
            candies = candies+max[i];
        }
        return candies;
    }
}