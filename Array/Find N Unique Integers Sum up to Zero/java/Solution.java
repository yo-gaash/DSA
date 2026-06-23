class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int i=1,j=-1;
        if(n%2!=0){
            result[n-1]=0;
            while(n-1>=1){
                result[n-1]=i;
                result[n-2]=j;
                i++;
                j--;
                n=n-2;
            }
        }
        else{
            while(n-1>=0){
                result[n-1]=i;
                result[n-2]=j;
                i++;
                j--;
                n=n-2;
            }
        }
        return result;
    }
}