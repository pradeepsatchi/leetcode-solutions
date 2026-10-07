class Solution {
    public int maxVowels(String s, int k) {
    int max=0;
    int c=0;
    for(int i=0;i<k;i++){
        if(IsVowel(s.charAt(i))){
            c++;
        }
    }
    max=c;
    for(int i=k;i<s.length();i++){
        if(s.length()==k){
            return max;
        }
        if(IsVowel(s.charAt(i))){
            c++;
        }
        if(IsVowel(s.charAt(i-k))){
            c--;
        }
         max=Math.max(max,c);
        }
       
    
    return max;     
    }
    static boolean IsVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    } 
}