1class Solution {
2    public static int[] recoverArray(int n, int[] sums) {
3        int[] ans = new int[n];
4        recurse(sums,n,ans,0);
5        System.out.print(Arrays.toString(ans));
6        return ans;
7    }
8    public static int[] recurse(int[] sums,int n, int[] ans,int index){
9        if(n==0){
10            return ans;
11        }
12        Arrays.sort(sums);
13        int diff = sums[1]-sums[0];
14        int[] groupA = new int[sums.length/2];
15        int[] groupB = new int[sums.length/2];
16        int idxA = 0;
17        int idxB = 0;
18        Map<Integer,Integer> count = new HashMap<>();
19        for(int num:sums){
20            count.put(num,count.getOrDefault(num,0)+1);
21        }
22        for(int num:sums){
23            if(count.getOrDefault(num,0)==0){
24                continue;
25            }
26            count.put(num,count.get(num)-1);
27            count.put(num+diff,count.get(num+diff)-1);
28            groupA[idxA++] = num;
29            groupB[idxB++] = num+diff;
30        }
31        if(containsZero(groupA)){
32            ans[index] = diff;
33            return recurse(groupA,n-1,ans,index+1);
34        }
35        else{
36            ans[index] = -diff;
37            return recurse(groupB,n-1,ans,index+1);
38        }
39
40    }
41    public static boolean containsZero(int[] arr){
42        for(int num:arr){
43            if(num==0){
44                return true;
45            }
46        }
47        return false;
48    }
49}