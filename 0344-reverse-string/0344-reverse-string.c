void reverseString(char* s, int sSize) {
int right=sSize-1;
int left=0;
while(left<right){
    char temp=s[right];
    s[right]=s[left];
    s[left]=temp;
    left++;
    right--;
}

  
}