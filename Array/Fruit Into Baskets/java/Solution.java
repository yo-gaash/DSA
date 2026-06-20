class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> bucket = new LinkedHashMap<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int right=0;right<=fruits.length-1;right++){
            bucket.put(fruits[right],bucket.getOrDefault(fruits[right],0)+1);
            for(Map.Entry<Integer,Integer> entrySet : bucket.entrySet()){
                System.out.print(entrySet.getKey()+"->"+entrySet.getValue());
            }
            while(bucket.size()>2){
                bucket.put(fruits[left],bucket.get(fruits[left])-1);
                if(bucket.get(fruits[left])==0){
                    bucket.remove(fruits[left]);
                }
                left++;
            }
            for(Map.Entry<Integer,Integer> entrySet : bucket.entrySet()){
                System.out.print(entrySet.getKey()+"->"+entrySet.getValue());
            }
            int count = 0;
            for(Map.Entry<Integer,Integer> entrySet : bucket.entrySet()){
                count = count+entrySet.getValue();
            }
            max = Math.max(max,count);
        }
        return max;
    }
}