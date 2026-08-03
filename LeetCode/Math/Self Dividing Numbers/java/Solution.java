class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isSelfDividingNumber(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    boolean isSelfDividingNumber(int n){
        int originalNum = n;
        while(n > 0){
            int lastDigit = n % 10;
            if (lastDigit == 0){
                return false;
            }
            if(originalNum % lastDigit != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}