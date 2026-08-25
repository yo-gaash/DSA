/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1,n);
    }
    public  int binarySearch(int start, int end){
        while(start<=end){
            int mid = start+((end-start)/2);
            if(isBadVersion(1)){
                return 1;
            }
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}