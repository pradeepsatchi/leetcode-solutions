class Solution {
    public String frequencySort(String s) {
    int n=s.length();
    HashMap<Character,Integer> map= new HashMap<>();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    ArrayList<Character> c=new ArrayList<>(map.keySet());
    c.sort((a,b)->map.get(b)-map.get(a));
    StringBuilder sb=new StringBuilder();
    for(char ch:c){
        int freq=map.get(ch);
        for(int i=0;i<freq;i++){
            sb.append(ch);
        }
    }


    
    return sb.toString();
    }
}