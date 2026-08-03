class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // 0 and 1 are their own square roots
        
        int left = 1, right = x / 2, ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;  // use long to prevent overflow
            
            if (sq == x) return mid;
            if (sq < x) {
                ans = mid;      // store possible answer
                left = mid + 1; // try higher
            } else {
                right = mid - 1; // try lower
            }
        }
        
        return ans; 
    }
}