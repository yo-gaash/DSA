class Solution {
    public int subtractProductAndSum(int n) {
        int rem,sum=0,prod=1,diff;
        while(n!=0){
            rem = n%10;
            sum = sum+rem;
            prod = prod*rem;
            n = n/10;
        }
        diff = prod-sum;
        return diff;
    }
}