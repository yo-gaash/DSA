class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] freq = new int[nums.length];
        for(int num:nums){
            if((num>=1)&&(num-1)<=freq.length-1){
                freq[num-1]=1;
            }
        }
        int ans = -1;
        for(int i=0;i<=freq.length-1;i++){
            if(freq[i]==0){
                ans = i+1;
                break;
            }
        }
        return (ans==-1)?nums.length+1:ans;
    }
}