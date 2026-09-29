class Solution {
    public int[] findErrorNums(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] arr =new int[2];
    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int i=1;i<=nums.length;i++){
        if(map.containsKey(i)){
            if(map.get(i)==2){
                arr[0]=i;
            }
        }
        else{
            arr[1]=i;
        }
    }  
    return arr;
    }
}