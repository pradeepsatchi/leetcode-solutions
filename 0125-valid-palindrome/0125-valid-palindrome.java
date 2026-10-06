class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
        }
    }
    int lt=0,rt=sb.length()-1;
    while(lt<rt){
        if(sb.charAt(lt)!=sb.charAt(rt)){
            return false;
        }
        lt++;
        rt--;
    }
    return true;
    }
}
    
