class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> s= new HashMap<>();
        HashMap<Integer,Integer> v= new HashMap<>();
        for(int i:target){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            v.put(i,v.getOrDefault(i,0)+1);
        }
        for(int i:target){
            if(!s.get(i).equals(v.get(i))){
                return false;
            }
        }
        return true;
        }
}