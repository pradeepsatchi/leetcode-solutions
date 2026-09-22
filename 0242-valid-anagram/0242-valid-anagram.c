bool isAnagram(char* s, char* t) {
int x=strlen(s)-1;
int y=strlen(t)-1;
int arr[26]={0};
int arr1[26]={0};
if(x!=y){
    return false;
}  
for(int i=0;i<=x;i++){
   arr[s[i]-'a']++;
   arr1[t[i]-'a']++;
}
for(int i=0;i<26;i++){
    if(arr[i]!=arr1[i]){
        return false;
    }
}
return true;
}