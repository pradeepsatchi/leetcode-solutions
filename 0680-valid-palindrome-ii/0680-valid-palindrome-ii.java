class Solution {
    public boolean validPalindrome(String s) {
    char[] ch=s.toCharArray();
    int lt=0;
    int rt=s.length()-1;
    while(lt<rt){
        if(ch[lt]!=ch[rt]){
            return isPalindrome(s,lt+1,rt) || isPalindrome(s,lt,rt-1);
        }
        lt++;
        rt--;

    } 
    return true;   
    }
    boolean isPalindrome(String s,int lt,int rt){
        while(lt<rt){
            if(s.charAt(lt)!=s.charAt(rt)){
                return false;
            }
            lt++;
            rt--;
        }
        return true;
    }
}