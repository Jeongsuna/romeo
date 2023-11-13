#include <iostream>

void f2()
{
    try
    {
        // ...
    }
    // catch-all 처리기가 다른 예외 처리보다 먼저 실행됩니다.
    catch (...) 
    {
        // 모든 예외 유형 처리
    }
    // catch-all 블럭이 모든 예외의 유형을 먼저 처리하므로 해당 핸들러는 호출되지 않습니다.
    catch (int32_t i) 
    {

    }
}

int main(void){return 0;}