class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int curr = 0;
        int start = 0;
        for(int i=0;i<=gas.length-1;i++){
            int diff = gas[i]-cost[i];
            total = total + diff;
            curr = curr + diff;
            if(curr<0){
                start = i+1;
                curr = 0;
            }
        }
        if(total>=0){
            return start;
        }
        else{
            return -1;
        }
    }
}