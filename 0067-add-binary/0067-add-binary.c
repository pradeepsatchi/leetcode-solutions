char* addBinary(char* a, char* b) {
    int i= strlen(a);
    int j= strlen(b);
    int max = (i > j ? i : j);
    char *result = malloc((max + 2) * sizeof(char));
    int x = i - 1;
    int y = j - 1;
    int k = max;
    int carry = 0;
    result[k + 1] = '\0';
    while (x >= 0 || y >= 0 || carry) {
        int add1 = 0;
        int add2 = 0;
        if (x >= 0)
            add1 = a[x] - '0';
        if (y >= 0)
            add2 = b[y] - '0';
    int sum = add1 + add2 + carry;
    result[k] = (sum % 2) + '0';
    carry = sum / 2;

    x--;
    y--;
    k--;
    }
return result + k + 1;
}