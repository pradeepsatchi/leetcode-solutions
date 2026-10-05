class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        } 
        HashMap<Character,Character> x=new HashMap<>(); 
        HashMap<Character,Character> y=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(x.containsKey(ch1)){
                if(x.get(ch1)!=ch2){
                    return false;
                }
            }
            if(y.containsKey(ch2)){
                if(y.get(ch2)!=ch1){
                    return false;
                }
            }
            
                x.put(ch1,ch2);
                y.put(ch2,ch1);

            
        }
    return true;  
    }
}