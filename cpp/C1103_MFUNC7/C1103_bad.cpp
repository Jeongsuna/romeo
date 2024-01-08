#include <stdint.h>

uint16_t func(uint16_t para1) 
{ 
    return para1; 
}

void discarded(uint16_t para2) 
{ 
    func(para2); // non-void func을 호출한 뒤 return value를 사용하지 않음. –Noncompliant
}

int main() 
{
    uint16_t para = 10;
    discarded(para);
    return 0;
}
