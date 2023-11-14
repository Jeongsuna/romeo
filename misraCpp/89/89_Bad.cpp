#include <stdint.h>

void f1(int32_t p[10]);
void f2(int32_t *p);

void f1(int32_t p[10]) {
    // f1 함수의 구현을 추가합니다.
}

void f2(int32_t *p) {
    // f2 함수의 구현을 추가합니다.
}

void b()
{
    int32_t a[10];
    // 배열을 함수에 전달할 때, 배열은 자동으로 포인터로 변환되어 int32_t* p를 받는 것처럼 동작하게 됩니다.
    f1(a);
    // f2 함수는 포인터를 인자로 받도록 선언되어 있습니다.
    f2(a);
}

int main() {
    b(); // b 함수를 호출
    return 0;
}