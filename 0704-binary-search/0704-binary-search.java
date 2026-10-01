class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int rt=nums.length-1;
        while(l<=rt){
        int mid=l+((rt-l)/2);
        if(nums[mid]==target){
                return mid;
        }
        else if(target>nums[mid]){
                l=mid+1;
        }
        else{
                rt=mid-1;
        }
        
    }
    return -1;      
    }
}