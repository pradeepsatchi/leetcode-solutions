class Solution {
    public String mergeAlternately(String word1, String word2) {
    char[] arr1=word1.toCharArray();
    char[] arr2=word2.toCharArray();
    StringBuilder sb=new StringBuilder();
    int n=word1.length();
    int m=word2.length();
    int x=0,y=0,i=0;
    while(x<n || y<m){
        
            if(i%2==0 && x<n){
                sb.append(arr1[x++]);
                
            }
            if(i%2!=0 && y<m){
                sb.append(arr2[y++]);
            }
            i++;     
    } 
    return sb.toString();  
    }
}