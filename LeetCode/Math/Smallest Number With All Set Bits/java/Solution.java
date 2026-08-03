class Solution {
    public int smallestNumber(int n) {
        int size = Integer.toBinaryString(n).length();
        int idx = 0;
        for(int i=0;i<=size-1;i++){
            if((n&(1<<i))==0){
                n|=(1<<i);
            }
        }
        return n;
    }
}