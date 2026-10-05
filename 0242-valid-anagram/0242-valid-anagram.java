class Solution {
    public boolean isAnagram(String s, String t) {
    int n=s.length();
    int m=t.length();
    if(n!=m){
        return false;
    } 
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        char ch1=s.charAt(i);
        map.put(ch1,map.getOrDefault(ch1,0)+1);
    }
    for(int i=0;i<n;i++){
        char ch2=t.charAt(i);
        map.put(ch2,map.getOrDefault(ch2,0)-1);
    }
    for(int x:map.values()){
        if(x!=0){
            return false;
        }
    }
    return true;
    }
}