class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int ans=0;
    for(int i=0;i<customers.length;i++){
        if(grumpy[i]==0){
            ans+=customers[i];
        }
    }
    int grumpysum=0;
    int max=0;
    for(int i=0;i<minutes;i++){
        if(grumpy[i]==1){
            grumpysum+=customers[i];
        }
    }
    max=grumpysum;
    for(int i=minutes;i<customers.length;i++){
        if(grumpy[i]==1){
            grumpysum+=customers[i];
        }
        if(grumpy[i-minutes]==1){
            grumpysum-=customers[i-minutes];
        }
        max=Math.max(max,grumpysum);
    }
    return ans+max;
    }
}