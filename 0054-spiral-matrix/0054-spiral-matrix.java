class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int  lt=0, rt=c-1,t=0,b=r-1,sum=0;
        while(lt<=rt && t<=b){

        for(int i=lt;i<=rt;i++){
            arr.add(matrix[lt][i]);
        }
        for(int i=t+1;i<=b;i++){
            arr.add(matrix[i][rt]);
        }
        if(t<b && lt<rt){
        for(int i=rt-1;i>=lt;i--){
            arr.add(matrix[b][i]);
        }
        for(int i=b-1;i>t;i--){
            arr.add(matrix[i][lt]);
        }
        }
        lt++;
        t++;
        rt--;
        b--;
        }
        return arr;
    }
}