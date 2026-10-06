class Solution {
    public int compress(char[] chars) {
        int r=0;
        int w=0;
        while(r<chars.length){
            char curr=chars[r];
            int c=0;
            while(r<chars.length && curr==chars[r] ){
                c++;
                r++;   
            }
            chars[w]=curr;
            w++;
            if(c>1){
                String var=String.valueOf(c);
                for(char x:var.toCharArray()){
                    chars[w]=x;
                    w++;
                }
            }
        }
    return w;
    }
}