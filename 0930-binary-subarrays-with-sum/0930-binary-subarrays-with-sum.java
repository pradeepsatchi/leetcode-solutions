class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int c=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int find=sum-goal;
            if(map.containsKey(find)){
                c+=map.get(find);
            }
             map.put(sum,map.getOrDefault(sum,0)+1);
            
        }

        return c;
    }
}