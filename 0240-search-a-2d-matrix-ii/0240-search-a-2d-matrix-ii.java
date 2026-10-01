class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int r=matrix.length;
    int c=matrix[0].length;
    for(int i=0;i<r;i++){
        int l=0;
        int rt=c-1;
        while(l<=rt){
        int mid=l+((rt-l)/2);
        if(matrix[i][mid]==target){
                return true;
        }
        else if(target>matrix[i][mid]){
                l=mid+1;
        }
        else{
                rt=mid-1;
        }
        
    }  
    } 
    return false;
    }
}