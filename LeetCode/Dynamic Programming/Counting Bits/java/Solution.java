class Solution {
    public int[] countBits(int n) {
        int[] setCounts = new int[n+1];
        for(int i=0;i<=n;i++){
            setCounts[i] = setCount(i);
        }
        return setCounts;
    }
    public static int setCount(int num){
        int count = 0;
        for(int i=0;i<32;i++){
            if( (num&(1<<i)) !=0 ){
                count++;
            }
        }
        return count;
    }
}