class Solution {
    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=length-1;i++){
            for(int j=0;j<=length-1;j++){
                if(indices[j]==i){
                    sb.append(s.charAt(j));
                    break;
                }
            }
        }
        return sb.toString();
    }    
}