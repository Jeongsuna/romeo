#include <iostream>

// 함수 템플릿 1
template <typename T> void f(T){}
//함수 템플릿 1의 명시적 특수화
template <> void f<int32_t*>(int32_t*){} 

void b(int32_t* i) 
{ 
    // 함수 템플릿 f에 대한 명시적 특수화가 있으며
    // 오버로드로 인한 혼란이 없습니다 (준수)
    f(i);
}

int main(void){return 0;}