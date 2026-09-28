class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    int c=0;
    HashMap<Integer,Integer> s= new HashMap<>();
    for(int x:nums1){
        for(int y:nums2){
            int sum=x+y;
            s.put(sum,s.getOrDefault(sum,0)+1);
        }
    }
    for(int p:nums3){
        for(int q:nums4){
            int search=-(p+q);
            c+=s.getOrDefault(search,0);
        }
    }
    return c;
    }
}