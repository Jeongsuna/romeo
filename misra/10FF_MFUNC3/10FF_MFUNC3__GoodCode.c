#include <stdio.h>

int addNumbers_10FF_2(int a, int b); // 함수 프로토타입 선언

int main(void) {
    int result = addNumbers_10FF_2(5, 3);
    printf("Result is: %d\n", result);
    return 0;
}

int addNumbers_10FF_2(int a, int b) {
    return a + b;
}
