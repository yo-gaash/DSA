class Solution {
    public static int reverseBits(int n) {
        int revNum = 0;
        for (int i = 0; i < 32; i++) {
            revNum = revNum<< 1;
            if((n&(1<<i))!=0){
                revNum|=1;
            }
        }
        return revNum;
    }
}