#include <iostream>
#include <stdint.h>

void f()
{
    uint32_t a = -1;                    // 부호 있는 정수 -1을 부호 없는 정수형으로 변환
    
    
    uint32_t c = 10;
    int32_t d = -5;
    if(c > d)                            // 비교 연산에서 d가 부호 없는 정수형으로 변환됩니다.
    {

    }

    uint32_t e = 10;
    int32_t f = -1;
    int32_t g = e + f;                  // 덧셈 연산에서 f가 부호 없는 정수형으로 변환됩니다.

    uint16_t h = 65535;
    int16_t i = h;                      // 부호 없는 short에서 부호 있는 short으로 변환

    uint64_t j = 5000000000;
    int64_t k = j;                      // 부호 없는 long에서 부호 있는 long으로 변환

    int32_t l = 10;
    uint32_t m = -l;                    // 부호 있는 정수를 부호 없는 정수로 변환

    uint32_t n = 10;
    int32_t o = -n;                     // 부호 없는 정수를 부호 있는 정수로 변환

    uint32_t p = 10;
    int32_t q = p - 20;                 // 뺄셈 연산에서 20이 부호 없는 정수형으로 변환됩니다.

    int32_t r = 10;
    uint32_t s = r - 20;            // 뺄셈 연산에서 r이 부호 없는 정수형으로 변환됩니다.

    int8_t s8 = -1;
    uint8_t u8 = 2;
    s8 = u8;                            // Non-compliant
    u8 = s8 + u8;                       // Non-compliant

    u8 = u8 + (u8 + s8);                // Non-compliant
}

int32_t bad_func() {
    uint32_t u32 = 300;

    return u32; // unsigined int 타입을 signed int로 변환 하여 반환.
}

int main() {
    f();
    std::cout << "Function executed successfully.\n";
    return 0;
}
