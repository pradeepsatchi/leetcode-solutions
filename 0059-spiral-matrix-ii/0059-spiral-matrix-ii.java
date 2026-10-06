class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int  lt=0, rt=n-1,t=0,b=n-1,sum=0;
        int y=0;
        int[] arr=new int[n*n];
        for(int x=0;x<n*n;x++){
            arr[x]=x+1;
        }
        while(lt<=rt && t<=b){

        for(int i=lt;i<=rt;i++){
            matrix[lt][i]=arr[y++];
        }
        for(int i=t+1;i<=b;i++){
            matrix[i][rt]=arr[y++];
        }
        if(t<b && lt<rt){
        for(int i=rt-1;i>=lt;i--){
            matrix[b][i]=arr[y++];
        }
        for(int i=b-1;i>t;i--){
            matrix[i][lt]=arr[y++];
        }
        }
        lt++;
        t++;
        rt--;
        b--;
        }
    return matrix  ;
    }
}