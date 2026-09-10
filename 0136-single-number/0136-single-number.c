int singleNumber(int* nums, int numsSize) {
if(numsSize==1){
    return nums[0];
}
for(int i=0;i<numsSize;i++){
    int count=1;
    int flag=1;
    for(int j=0;j<numsSize;j++){
        if(i==j ){
            continue;
        }
        if(count==2){
            break;
        }
        if(nums[i]==nums[j]){
            count++;
        }
    
    }
    if(count<2){
        return nums[i];
    }
    
}
return 0;
}
