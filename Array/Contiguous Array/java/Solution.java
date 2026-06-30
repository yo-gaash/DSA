class Solution {
    public int findMaxLength(int[] nums) {
        int[] sums = new int[nums.length+1];
        for(int i=0;i<=sums.length-2;i++){
            if(nums[i]==0){
                sums[i+1] = sums[i]-1;
            }
            else{
                sums[i+1] = sums[i]+1;
            }
        }
        System.out.println(Arrays.toString(sums));
        Map<Integer,Integer> index = new HashMap<>();
        for(int i=0;i<=sums.length-2;i++){
            for(int j=i+1;j<=sums.length-1;j++){
                if(sums[j]-sums[i]==0){
                    index.put(i,j);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:index.entrySet()){
            max = Math.max(max,entry.getValue()-entry.getKey());
        }
        return max;
    }
}