class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1;
        int temp = n;
        while(n>0){
            int rem = n%10;
            prod*=rem;
            n/=10;
        }
        if(prod%t==0){
            return temp;
        }
        else{
            return smallestNumber(temp+1,t);
        }
    }
}