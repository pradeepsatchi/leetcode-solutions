class Solution {
    public int minSubarray(int[] nums, int p) {
        long total=0;
        for(int x:nums){
            total+=x;
        }
        int target=(int)(total%p);
        if(target==0){
            return  0;
        } 
        HashMap<Integer,Integer> m= new HashMap<>();
        m.put(0,-1);
        long sum=0;
        int minl=nums.length;
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%p;
            int val=(int)sum;
            int req=(val-target+p)%p;
            if(m.containsKey(req)){
                int len=i-m.get(req);
                minl=Math.min(minl,len);
            }
            m.put(val,i);
        } 
        return minl==nums.length?-1:minl;
    }
}