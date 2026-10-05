class Solution {
    public int firstUniqChar(String s) {
    int n=s.length();
    HashMap<Character,Integer> m=new HashMap<>();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        m.put(ch,m.getOrDefault(ch,0)+1);
    }
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(m.get(ch)==1){
            return i;
        }
    }
    return -1;  
    }
}