int missingNumber(int* nums, int numsSize) {
int temp[numsSize+1];
for(int i=0;i<=numsSize;i++){
    temp[i]=0;
    }
for(int i=0;i<numsSize;i++){
    temp[nums[i]]=1;
}
for(int i=0;i<=numsSize;i++){
    if(temp[i]==0){
        return i;
    }
}
return 0;
}