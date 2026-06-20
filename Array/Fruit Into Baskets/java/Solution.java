class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> bucket = new HashMap<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int right=0;right<=fruits.length-1;right++){
            bucket.put(fruits[right],bucket.getOrDefault(fruits[right],0)+1);
            while(bucket.size()>2){
                bucket.put(fruits[left],bucket.get(fruits[left])-1);
                if(bucket.get(fruits[left])==0){
                    bucket.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}