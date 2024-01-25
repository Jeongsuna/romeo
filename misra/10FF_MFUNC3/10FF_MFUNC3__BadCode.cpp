#include <stdio.h>

int main(void) {
    int result = addNumbers1(5, 3); // addNumbers 함수가 선언되지 않았으므로 암묵적 선언 발생
    printf("Result is: %d\n", result);
    return 0;
}

int addNumbers1(int a, int b) {
    return a + b;
}
