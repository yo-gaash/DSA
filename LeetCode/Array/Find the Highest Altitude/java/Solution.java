class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        if(gain[0]>max){
            max = gain[0];
        }
        for(int i=1;i<=gain.length-1;i++){
            gain[i] = gain[i-1]+gain[i];
            if(gain[i]>max){
                max = gain[i];
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }
}