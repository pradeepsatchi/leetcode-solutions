class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    HashMap<Integer,Boolean> s =new HashMap<>();
    ArrayList<Integer> v =new ArrayList<>();
    for(int x:nums){
        s.put(x,true);
    } 
    for(int i=1;i<=nums.length;i++){
        if(!s.containsKey(i)){
            v.add(i);
        }
    } 
    return v;
    }
}