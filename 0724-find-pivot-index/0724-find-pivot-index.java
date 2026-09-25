class Solution {
    public int pivotIndex(int[] nums) {
    for(int i=0;i<nums.length;i++){
        int leftsum=0;
        int rightsum=0;
        for(int j=0;j<i;j++){
          leftsum+=nums[j];  
        }
        for(int k=nums.length-1;k>i;k--){
          rightsum+=nums[k];  
        }
        if(leftsum==rightsum){
            return i;
        }
    }
    return -1;   
    }
}