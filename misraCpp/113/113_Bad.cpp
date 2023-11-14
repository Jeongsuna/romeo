#include <iostream>


bool modify(int32_t* pX)
{
    (*pX)++;
    return (*pX < 10);
}

int main(){
    // 조건식에서 modify(&x) 함수가 호출될 때 x의 값을 증가시키고 있습니다.(비준수)
    for (int32_t x = 0; modify(&x);)
    {

    }

    // 루프 몸체 내에서 x의 값을 x * 2로 수정 하고있습니다.(비준수)
    for (int32_t x = 0; x < 10;)
    {
        x = x * 2;
    }
    
    return 0;
}