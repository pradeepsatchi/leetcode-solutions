#include <stdlib.h>

int divide(int dividend, int divisor) {

    long long a = llabs((long long)dividend);
    long long b = llabs((long long)divisor);

    long long count = 0;

    while (a >= b) {

        long long temp = b;
        long long multiple = 1;

        
        while ((temp << 1) <= a) {
            temp = temp << 1;
            multiple = multiple << 1;
        }

        
        a = a - temp;
        count = count + multiple;
    }
    if ((dividend < 0) != (divisor < 0)) {
        count = -count;
    }
    if (count > 2147483647)
        return 2147483647;

    if (count < -2147483648LL)
        return -2147483648LL;

    return (int)count;
}