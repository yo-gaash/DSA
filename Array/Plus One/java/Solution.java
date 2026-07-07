class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int i=digits.length-1,carry=1;
        while(i>=0||carry>0){
            int sum = carry;
            if(i>=0){
                sum = digits[i]+sum;
            }
            result.add(sum%10);
            carry = sum/10;
            i--;
        }
        Collections.reverse(result);
        int[] arr = new int[result.size()];
        for(i=0;i<=result.size()-1;i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}