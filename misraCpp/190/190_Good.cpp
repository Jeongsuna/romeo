#include <iostream>

void f1()
{
    try
    {
        // ...
    }
    catch (int32_t i)
    {
        // int 예외 처리 작성
    }
    // catch-all 핸들러가 마지막에 위치에 존재 합니다.
    catch (...)
    {
        // 모든 다른 예외 유형 처리 작성
    }
}

int main(void){return 0;}