class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1){
            return 1;
        }
        int start = 0;
        int count = -1;
        int max = Integer.MIN_VALUE;
        while(start<=fruits.length-2){
            int end = start+1;
            while(end<=fruits.length-1){
                count = count(fruits,start,end);
                max = Math.max(count,max);
                end++;
            }
            start++;
        }
        return max;
    }
    public static int count(int[] arr, int start, int end){
        Set<Integer> set = new HashSet<>();
        for(int i=start;i<=end;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
        if(set.size()>2){
            return -1;
        }
        int first = arr[start];
        int second = arr[start+1];
        int count = 0;
        for(int i=start;i<=end;i++){
            if(arr[i]==first){
                count++;
            }
            else{
                count++;
            }
        }
        System.out.println(count+" "+start+" "+end);
        return count;
    }
}