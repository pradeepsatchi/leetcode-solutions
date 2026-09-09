/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numRows, int* returnSize, int** returnColumnSizes) {
    *returnSize=numRows;
    *returnColumnSizes=malloc(sizeof(int)*numRows);
   int **arr=malloc(sizeof(int*)*numRows);
   for(int i=0;i<numRows;i++){
    int col=i+1;
    (*returnColumnSizes)[i]=col;
    arr[i]=malloc(sizeof(int)*col);
    arr[i][0]=1;
    arr[i][col-1]=1;
    for(int j=1;j<col-1;j++){
        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
    }
   }
   return arr;
   }
