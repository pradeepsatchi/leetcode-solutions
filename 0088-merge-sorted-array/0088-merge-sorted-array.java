class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int x=m-1;
    int y=n-1;
    int p2=m+n-1;
    while( x>=0 && y>=0 ){
        if(nums2[y]>=nums1[x]){
            nums1[p2]=nums2[y];
            y--;
            p2--;
        }
        else{
            nums1[p2]=nums1[x];
            x--;
            p2--;
        }
    } 
    while(y>=0){
        nums1[p2]=nums2[y];
        y--;
        p2--;
    } 
    
    }
}