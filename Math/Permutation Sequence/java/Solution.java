class Solution {
    public String getPermutation(int n, int k) {
        String num = num(n);
        return recurse(n,num,k-1,"");
    }
    public static String recurse(int n, String num, int k, String perSeq){
        if(n==0){
            return perSeq;
        }
        int factOfDigits = fact(n-1);
        int index = k/factOfDigits;
        perSeq = perSeq+getNum(index,num);
        String rem = num.substring(0,index)+num.substring(index+1);
        return recurse(n-1,rem,k%factOfDigits,perSeq);
    }
    public static int getNum(int index, String num){
        int digit = 0;
        for(int i=0;i<=index;i++){
            digit = num.charAt(i)-'0';
        }
        return digit;
    }
    public static String num(int n){
        String result = "";
        for(int i=1;i<=n;i++){
            result = result+i;
        }
        return result;
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}