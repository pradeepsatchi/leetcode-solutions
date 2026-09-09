bool isPalindrome(int x) {
    if(x<0){
        return 0;
    }
    else{
        long long int sum=0;
        int n=x;
        while(x!=0){
          sum=sum*10+x%10;
          x=x/10;
        }
        if(n==sum)
        return 1;
        else
        return 0;;
    }
}

    