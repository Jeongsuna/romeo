#include <iostream>
#include <stdint.h>
namespace NS2
{
    // 유니온을 사용하고 있습니다.(비준수)
    union U1
    {
        int32_t i;
        float j;
    };
}

int main(void){
    return 0;
}