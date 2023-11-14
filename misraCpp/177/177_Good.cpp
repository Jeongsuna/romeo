#include <iostream>

// 예제 1
void f(short){} 
// 예제 2
template <typename T> void f(T){}

void b(short s) {
    // 함수 호출이 명시적으로 함수 템플릿을 호출하고 있습니다.(준수)
    // 예제 1
    f<>(s); 
    // 예제 2
    f<>(s + 1);
}

int main(void){return 0;}