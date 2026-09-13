/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize) {
   int **arr=malloc(sizeof(int*)*(rowIndex+1));
   for(int i=0;i<=rowIndex;i++){
    int col=i+1;
    arr[i]=malloc(sizeof(int)*col);
    arr[i][0]=1;
    arr[i][col-1]=1;
    for(int j=1;j<col-1;j++){
        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
    }
   }
   *returnSize=rowIndex+1;
   return arr[rowIndex];
}