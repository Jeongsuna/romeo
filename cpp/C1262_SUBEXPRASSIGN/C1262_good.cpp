#include <iostream>

int16_t foo() {
    // 여기에서 적절한 값을 반환하거나, 반환값이 필요하지 않다면 void를 반환하십시오.
}

// 하위 표현식 내에서 할당 연산자(=)를 사용하지 않습니다.
int main() {
    int x, y, z;

    // foo()의 결과를 int16_t 변수 i에 할당하고, 그 값을 검사합니다(준수)
    if ( int16_t i = foo( ) ) 
    { 
    }
    // x와 y를 비교하여 그 결과를 bool 변수(b1)에 할당합니다(준수)
    bool b1 = x != y;
    // bool 변수 b2를 선언하고, 그 다음에 x와 y를 비교하여 b2에 그 결과를 할당합니다(준수)
    bool b2; 
    b2 = x != y; 
    // foo()의 결과를 int16_t 변수 i에 할당하고, 그 값을 검사합니다(준수)
    if ( x != 0 ) 
    { 
        foo ( ); 
    }

    return 0;
}