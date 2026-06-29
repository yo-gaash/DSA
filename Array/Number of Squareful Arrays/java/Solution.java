class Solution {
    public int numSquarefulPerms(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()!=1){
            ans = permute(nums);
        }
        else{
            ans.add(new ArrayList());
            for(int i=0;i<=nums.length-1;i++){
                ans.get(0).add(nums[i]);
            }
        }
        int result = 0;
        for(List<Integer> temp : ans){
            int count = 0;
            for(int i=0;i<=temp.size()-2;i++){
                int num = temp.get(i)+temp.get(i+1);
                if(square(num)){
                    count++;
                }
            }
            System.out.println(temp+" "+count);
            if(count==nums.length-1){
                result++;
            }
        }
        return result;
    }
    public static boolean square(int num){
        int sqrt = (int)Math.sqrt(num);
        if(sqrt*sqrt!=num){
            return false;
        }
        return true;
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length==1){
            ans.add(Arrays.asList(nums[0]));
            return ans;
        }
        for(int i=0;i<=nums.length-1;i++){
            int num = nums[i];
            int[] rem = new int[nums.length-1];
            int idx = 0;
            for(int j=0;j<=nums.length-1;j++){
                if(j!=i){
                    rem[idx++] = nums[j];
                }
            }
            List<List<Integer>> prems = permute(rem);
            for(List<Integer> p:prems){
                List<Integer> curr = new ArrayList<>();
                curr.add(num);
                curr.addAll(p);
                ans.add(curr);
            }
        }
        return ans;
    }
}