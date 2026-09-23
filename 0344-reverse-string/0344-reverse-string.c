void reverseString(char* s, int sSize) {
int x=sSize-1;
for(int i=0;i<sSize/2;i++){
    int temp=s[x];
    s[x]=s[i];
    s[i]=temp;
    x--;
}
for(int i=0;i<sSize;i++){
    printf("%d",s[i]);
}
  
}