class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int length = image.length;
        for(int i=0;i<=length-1;i++){
            for(int j=0;j<=(length-1)/2;j++){
                int temp = 1-image[i][j];
                image[i][j] = 1-image[i][length-1-j];
                image[i][length-1-j] = temp;
            }
        }
        return image;
    }
}