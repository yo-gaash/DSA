class Solution {
    public boolean isPowerOfFour(int n) {
        if((n>0)&&(n&(n-1))==0){
            int size = Integer.toBinaryString(n).length()-1;
            if(size%2==0){
                return true;
            }
        }
        return false;
    }
}