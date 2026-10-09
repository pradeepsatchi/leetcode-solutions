class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int odd=substr(s,i,i);
            int even=substr(s,i,i+1);
            c+=odd+even;
            }
            return c;
        }   
    
    int substr(String s,int l,int r){
        int c=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) ){
            l--;
            r++;
            c++;
        }
        return c;
    }    
    
}