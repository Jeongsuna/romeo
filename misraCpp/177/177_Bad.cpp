#include <iostream>

// 예제 1
void f(short){}
// 예제 2
template <typename T> void f(T){}

void b(short s) {
    //  함수 호출의 사용 가능한 함수 집합이 
    //함수 전문화와 비전문화 함수를 혼용하고 있습니다. (비준수)
    // 예제 1
    f(s);
    // 예제 2
    f(s + 1);
}

int main(void){return 0;}
