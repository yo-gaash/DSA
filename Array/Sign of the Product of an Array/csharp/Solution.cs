public class Solution {
    public int ArraySign(int[] nums) {
        int product = 1;
        foreach(int num in nums){
            product*=num;
        }
        return signFunc(product);
    }
    public static int signFunc(int num){
        if(num>0){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        return 0;
    }
}