class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rytProduct = 1;
        int res = nums[0];
        for(int i=0;i<n;i++){
            leftProduct = leftProduct==0?1:leftProduct;
            rytProduct = rytProduct==0?1:rytProduct;
            leftProduct = leftProduct*nums[i];
            rytProduct = rytProduct*nums[n-1-i];
            res = Math.max(res,Math.max(leftProduct,rytProduct));
        }
        return res;
    }
}