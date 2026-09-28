class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> s=new HashSet<>();
    HashSet<Integer> m=new HashSet<>();
    for(int x:nums1){
        s.add(x);
    }
    for(int y:nums2){
        if(s.contains(y)){
            m.add(y);
        }
    }
    int[] result = new int[m.size()];
    int x=0;
    for(int i:m) {
    result[x] = i;
    x++;
}
    return result;
    }
}