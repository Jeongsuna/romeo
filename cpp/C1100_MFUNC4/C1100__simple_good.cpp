#include <iostream>


int fn3(int x)
{
 if (x > 100)
    {
        // 예외 처리는 반환문이 없는 것이 허용됩니다.(준수)
        throw 42;
    } 
    // x 값을 반환하기 위한 명시적인 반환문이 있습니다.(준수) 
    return (x);
}

int main(void){return 0;}