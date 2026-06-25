class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            int prod = 1;
            for(int j=0;j<=nums.length-1;j++){
                if(i==j){
                    continue;
                }
                else{
                    prod = prod*nums[j];
                    System.out.println(prod+" "+j);
                }
            }
            //System.out.print(prod);
            prefix[i] = prod;
        }
        return prefix;
    }
}