class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
     double sum=0;
     int c=0;
    for(int i=0;i<k;i++){
        sum=sum+arr[i];
    }
    if(sum/k>=threshold){
        c++;
    }
    for(int i=k;i<arr.length;i++){
        if(arr.length==k){
            return c;
        }
        sum=sum-arr[i-k]+arr[i];
        if(sum/k>=threshold){
        c++;
    }
    }
    return c;   
    }
}