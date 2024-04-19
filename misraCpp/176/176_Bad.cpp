#include <iostream>

// 오버로드된 함수 템플릿 1
template <typename T> void f(T){}
// 오버로드된 함수 템플릿 2
template <typename T> void f(T*){}
//함수 템플릿 1의 명시적 특수화
template <> void f<int32_t*>(int32_t*){}

void b(int32_t* i) 
{ 
    // 오버로드 된 함수 템플릿은 명시적으로 특수화 되지 않아야 합니다.(비준수)
    f(i);
}

int main(void){return 0;}