class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int count=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=chars.length-1;i++){
            if(chars[j]==chars[i]){
                count++;
            }
            else{
                sb.append(chars[j]);
                if(count!=1) sb.append(String.valueOf(count));
                j=i;
                count=1;
            }
        }
        sb.append(chars[j]);
        if(count!=1) sb.append(String.valueOf(count));
        for(int i=0;i<=sb.length()-1;i++){
            chars[i]=sb.charAt(i);
        }
        for(int i=0;i<=sb.length()-1;i++){
            System.out.println(chars[i]);
        }
        return sb.length();
    }
}