#include <iostream>

enum enum1
{
    enum1_ERROR,
    enum1_E1,
    enum1_E2
};

enum EnumError
{
    ENUM_ERROR
};

enum1 convert(int16_t v) 
{ 
    enum1 result = enum1_ERROR;
    switch (v) 
    { 
        // 열거형 기본 타입이 있는 식에는 열거형의 열거자에 해당하는 값만 있어야 합니다.(준수) 
        case 0: { result = enum1_E1; break; } 
        case 1: { result = enum1_E2; break; }
        default: { throw (ENUM_ERROR); break; } 
    } 
    return result; 
}

int main(void){return 0;}