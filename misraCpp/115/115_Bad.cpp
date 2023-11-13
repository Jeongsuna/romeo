#include <iostream>


int main(void){return 0;}

int test_a(int* bool_a) {
    
    return *bool_a;
}

int test(int x) {

    return x + 1;
}

void fn() {
    int x = 0;
    int bool_a = 0;

    // 루프 제어 변수를 조건식 내에서 수정함 (준수하지 않음)
    for (x = 0; (x < 10) && test_a(&bool_a); ++x) {
        
    }
}

void fn2() {
     int x = 0;
    int bool_a = 0;
    // 루프 제어 변수를 표현식 내에서 수정함 (준수하지 않음)
    for (x = 0; x < 10; bool_a = test(++x)) {
        
    }
}