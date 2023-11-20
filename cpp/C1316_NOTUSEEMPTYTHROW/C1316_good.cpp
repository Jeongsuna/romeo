#include <iostream>
#include <stdint.h>
void f1 (void)
{
    try
    {
        throw (42);
    }
    catch (int32_t i)
    {
        if (i > 0)
        {
            // catch 핸들러의 복합 문에서 empty throw를 사용하고 있습니다(준수)
            throw;
        }
    }
}

void g1 (void)
{
    try
    {
        f1 ();
    }
    catch (int32_t i)
    {
        // f1의 핸들러가 필요한 작업을 완료한 후 f1()에서 다시 throw를 처리합니다
    }
}

int main(void){
    f1();
    g1();
    return 0;
}