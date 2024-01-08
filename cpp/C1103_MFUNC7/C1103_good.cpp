#include <stdint.h>

uint16_t func(uint16_t para1) 
{ 
    return para1; 
}

void discarded(uint16_t para2) 
{ 
    (void)func(para2); // Compliant 
}

int main() 
{
    uint16_t para = 10;
    discarded(para);
    return 0;
}
