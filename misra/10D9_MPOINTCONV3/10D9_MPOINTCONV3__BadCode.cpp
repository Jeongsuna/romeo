#include <cstdint>

void f2(void) 
{
    uint8_t* p1 = 0;
    uint32_t* p2;

    /* Non-compliant - possible incompatible alignment */
    p2 = (uint32_t*)p1;
}


extern uint32_t read_value(void) { return 0; };
extern void print(uint32_t n) {};

void f(void)
{
    uint32_t u = read_value();
    uint16_t* hi_p = (uint16_t*)&u; /* Non-compliant even though
                                            * probably corretly aligned */

    *hi_p = 0;    /* Attempt to clear high 16-bits on big-endian machines */
    print(u);  /* Line above may appear not to have been performed */
}

int fake_main()
{
    int* const* pcpi = 0;
    const int* const* pcpci;

    pcpci = (const int* const*)pcpi;
       
    return 0;
}