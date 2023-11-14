#include <iostream>

void fn() 
{ 
    int x;
    try 
    { 
        if (x < 10) 
        {
            // x 가 10일때 예외를 발생시켜 처리합니다.(비준수)
            // 예외는 오류 처리에만 사용해야 합니다.
            throw (10); 
        }
        //  "A" 동작 실행
    }
    // 해당 예외를 처리하는 블록
    catch (int32_t y) 
    { 
        // "B" 동작 실행 
    } 
}

int main(void){return 0;}