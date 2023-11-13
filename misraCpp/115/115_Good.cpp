#include <iostream>

int main(void){return 0;}

void fn() {
    int x;
    bool bool_a = false;
    // 루프 제어 변수를 조건식 내에서 수정하지 않음 (준수)
    for (x = 0; (x < 10) && !bool_a; ++x) {
        if (x == 1) {
            bool_a = true;
        }
    }
}

void fn2() {
    int x;
    volatile bool status;
    // 루프 제어 변수가 volatile로 선언되어 변경 가능 (준수)
    for (x = 0; (x < 10) && status; ++x) {

    }
}