#include <iostream>

// Translation unit A 
void foo() throw(const char *)
{
    // 예외를 던집니다.
    throw "Hello World!";
}

// Translation unit B 
// Translation Unit A 에서 foo 함수의
// 예외 사양(const char*) 과 다릅니다.
extern void foo() throw(int32_t); 

// A,B  모두 동일한 예외 사양을 가져야 합니다.
void b() throw(int32_t)
{
    
    foo(); 
}

int main(void){return 0;}
