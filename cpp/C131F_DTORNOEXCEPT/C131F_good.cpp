#include <iostream>
#include <stdint.h>

class C1
{
public:
    ~C1 ( )
    {
        try
        {
            // 소멸자 내에서 발생한 예외가 소멸자 외부로 빠져나가지 않고
            // 적절히 처리되므로, 프로그램은 정상적으로 종료됩니다.
            throw ( 42 );
        }
        // int 핸들러
        catch ( int32_t i )
        {
            // 소멸자 내에서 처리되는 int 예외
        }
    }
};

int main(void){
    return 0;
}