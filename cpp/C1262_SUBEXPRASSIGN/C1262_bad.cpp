#include <iostream>

void foo() {
}

// 하위 표현식 내에서 할당 연산자(=)를 사용하고 있습니다
int main() {
    int x, y, z;

    // x와 y에 z의 값을 할당합니다.(비준수)
    x = y = z; 
    // x에 y의 값을 할당하고, 그 결과를 0과 비교합니다 (비준수)
    if ( ( x = y ) != 0 ) 
    { 
        foo ( ); 
    }
    // x에 y의 값을 할당하고, 그 결과를 검사합니다. (비준수)
    if ( x = y )
    { 
        foo ( ); 
    }
    return 0;
}