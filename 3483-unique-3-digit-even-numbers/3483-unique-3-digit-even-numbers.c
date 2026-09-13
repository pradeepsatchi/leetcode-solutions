int totalNumbers(int* digits, int digitsSize) {
    
    int count = 0;
    int arr[1000]={0};
for (int i = 0; i < digitsSize; i++) {
    for (int j = 0; j < digitsSize; j++) {
        for (int k = 0; k < digitsSize; k++) {

            if (digits[i] != 0 &&
                i != j &&
                i != k &&
                j != k &&
                digits[k] % 2 == 0) {
int num = digits[i] * 100 + digits[j] * 10 + digits[k];

    if (arr[num] == 0) {
        arr[num] = 1;
        count++;
    }
            }
        }
    }
}
    return count;

}