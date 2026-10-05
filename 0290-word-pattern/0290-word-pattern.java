class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        String[] words=s.split(" ");
        int m=words.length;
        if(n!=m){
            return false;
        } 
        HashMap<Character,String> x=new HashMap<>(); 
        HashMap<String,Character> y=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch1=pattern.charAt(i);
            String ch2=words[i];
            if(x.containsKey(ch1)){
                if(!x.get(ch1).equals(ch2)){
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