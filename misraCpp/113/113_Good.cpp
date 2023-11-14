#include <iostream>


bool modify(int32_t* pX)
{
    (*pX)++;
    return (*pX < 10);
}

int main(){
    // 루프 카운터(x)값을 조건식 내에서 수정하지 않도록 합니다.
    for (int32_t x = 0; x < 10;)
    {
        // 루프 카운터(x)값을 루프 몸체 내에서 수정하지 않도록 합니다.
    }
    return 0;
}