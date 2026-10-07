class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(Character.isLetter(arr[i])){
                sb.append(arr[i]);
            }
        }
        sb.reverse();
        int x=0;
        char[] arr1=sb.toString().toCharArray();
         for(int i=0;i<n;i++){
            if(Character.isLetter(arr[i])){
                arr[i]=arr1[x++];
            }
         
    }
    return new String(arr);
}
}