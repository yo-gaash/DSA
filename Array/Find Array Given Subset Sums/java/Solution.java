class Solution {
    public static int[] recoverArray(int n, int[] sums) {
        int[] ans = new int[n];
        recurse(sums,n,ans,0);
        System.out.print(Arrays.toString(ans));
        return ans;
    }
    public static int[] recurse(int[] sums,int n, int[] ans,int index){
        if(n==0){
            return ans;
        }
        Arrays.sort(sums);
        int diff = sums[1]-sums[0];
        int[] groupA = new int[sums.length/2];
        int[] groupB = new int[sums.length/2];
        int idxA = 0;
        int idxB = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:sums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int num:sums){
            if(count.getOrDefault(num,0)==0){
                continue;
            }
            count.put(num,count.get(num)-1);
            count.put(num+diff,count.get(num+diff)-1);
            groupA[idxA++] = num;
            groupB[idxB++] = num+diff;
        }
        if(containsZero(groupA)){
            ans[index] = diff;
            return recurse(groupA,n-1,ans,index+1);
        }
        else{
            ans[index] = -diff;
            return recurse(groupB,n-1,ans,index+1);
        }

    }
    public static boolean containsZero(int[] arr){
        for(int num:arr){
            if(num==0){
                return true;
            }
        }
        return false;
    }
}