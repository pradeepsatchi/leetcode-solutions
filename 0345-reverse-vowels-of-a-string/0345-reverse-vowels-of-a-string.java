class Solution {
    public String reverseVowels(String s) {
    int n=s.length();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                   sb.append(ch);  
        }
    }
    int x=0;
    sb.reverse();
    char[] words=s.toCharArray();
    for(int i=0;i<n;i++){
        char ch=words[i];
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            words[i]=sb.charAt(x);
            x++;
        }

    }
    return new String(words);
    }
}