int lengthOfLastWord(char* s) {
 int l=strlen(s)-1;
 int count=0;
 for(int i=l;i>=0;i--){
    if(s[i]!=' '){
        while(i>=0 && s[i]!=' '){
            count++;
            i--;
        }
        return count;
    }
 }
 return 0;
}