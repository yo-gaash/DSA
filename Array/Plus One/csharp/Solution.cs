public class Solution {
    public int[] PlusOne(int[] digits) {
        int num = 0;
        for(int i=0;i<=digits.Length-1;i++){
            num = (num*10)+digits[i];
        }
        Console.WriteLine(num);
        num = num+1;
        int temp = num;
        int length = 0;
        while(temp!=0){
            temp = temp/10;
            length++;
        }
        Console.WriteLine(length);
        int[] result = new int[length];
        for(int i=length-1;i>=0;i--){
            result[i] = num%10;
            num = num/10;
        } 
        return result;
    }
}