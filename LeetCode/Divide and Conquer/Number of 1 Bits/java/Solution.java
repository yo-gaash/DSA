class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<=binary.length()-1;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}