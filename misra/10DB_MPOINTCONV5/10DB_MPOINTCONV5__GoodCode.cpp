#include <cstdint>

int main()
{
    uint16_t p16;
    uint32_t p32;
    void* p;

 //   p = p32;                /* Compliant - pointer to uint32_t into
                              /* pointer to void */
    p = (void*)p16;     /* Compliant */
    
    return 0;
}