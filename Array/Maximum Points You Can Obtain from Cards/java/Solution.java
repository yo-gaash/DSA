class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n-k;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = windowSize;
        while(end<=n){
            int sum = 0;
            for(int i=start;i<=end-1;i++){
                sum = sum+cardPoints[i];
            }
            min = Math.min(min,sum);
            start++;
            end++;
        }
        int totalSum = 0;
        for(int i=0;i<=n-1;i++){
            totalSum = totalSum+cardPoints[i];
        }
        int max = totalSum-min;
        return max;
    }
}