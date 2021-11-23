#include <cstdint>
uint8_t* func2(void)
{
    uint8_t local_auto;

    return &local_auto;  /* Non-compliant - &local_auto is indeterminate
                           * when func returns */
}

uint16_t* sp2;

void g2(uint16_t* p)
{
    sp2 = p;               /* Non-compliant - address of f's parameter
                          * copied of static sp */
}

void f2(uint16_t u)
{
    g2(&u);
}

void h2(void)
{
    static uint16_t* q;

    uint16_t x = 0u;

    q = &x;             /* Non-compliant - &x stored in object with greater lifetime */
}

int fake_main() {
    func2();
    g2(0);
    h2();
    return 0;
}