class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
    int l=0,cost=0,maxlen=Integer.MIN_VALUE;
    for(int i=0;i<s.length();i++){
        cost+=Math.abs(s.charAt(i)-t.charAt(i));
        while(cost>maxCost){
            cost-=Math.abs(s.charAt(l)-t.charAt(l));
            l++;
        }
        maxlen=Math.max(maxlen,i-l+1);
    } 
    return maxlen;  
    }
}