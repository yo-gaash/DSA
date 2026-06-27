class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:frequency.entrySet()){
            max = Math.max(max,entry.getValue());
        } 
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            if(entry.getValue()==max){
                i++;
            }
        }      
        int[] keys = new int[i];
        int idx = 0;
        for(Map.Entry<Integer,Integer> entry:frequency.entrySet()){
            if(entry.getValue()==max){
                keys[idx] = entry.getKey();
                idx++;
            }
        }
        System.out.println(Arrays.toString(keys));
        int min = Integer.MAX_VALUE;
        for(int key:keys){
            int count = 0;
            int start = 0;
            int end = 0;
            int minLen = Integer.MAX_VALUE;
            while(end<=nums.length-1){
                if(nums[end]==key){
                    count++;
                }
                while(count==max){
                    if(nums[start]==key){
                        minLen = Math.min(minLen,end-start+1);
                        System.out.println(key+" "+minLen);
                        break;
                    }
                    start++;
                }
                if(count==max){
                    break;
                }
                end++;
            }
            min = Math.min(minLen,min);
        }
        return min;
    }
}