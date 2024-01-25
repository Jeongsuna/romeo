#include <stdio.h>

int addNumbers2(int a, int b); // 함수 프로토타입 선언

int main(void) {
    int result = addNumbers2(5, 3);
    printf("Result is: %d\n", result);
    return 0;
}

int addNumbers2(int a, int b) {
    return a + b;
}
