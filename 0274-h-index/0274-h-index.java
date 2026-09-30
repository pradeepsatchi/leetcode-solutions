class Solution {
    public int hIndex(int[] citations) {
     int max=0;
     for(int i=1;i<=citations.length;i++){
        int c=0;
        for(int j=0;j<citations.length;j++){
            if(citations[j]>=i){
                c++;
            }
        }
        if(c>=i){
            max=Math.max(i,max);
        }
     }   
    return max;
    }
}