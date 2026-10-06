class Solution {
    public int longestPalindrome(String s) {
    int count=0;
    int n=s.length();
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(char x:map.keySet()){
        if(map.get(x)%2==0){
            count+=map.get(x);
        }if(map.get(x)%2!=0 && map.get(x)>2){
            count+=map.get(x)-map.get(x)%2;
        }
    }
    for(char x:map.keySet()){
        if(map.get(x)%2!=0){
            return count+1;
        }
    }
    return count;   
    }
}