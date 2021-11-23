#include <cstdint>
#define BASE 65024u
#define bool_t bool

#if 1u + ( 0u - 10u )  /* Non-compliant as ( 0u - 10u ) wraps */
#endif

#define DELAY 10000u
#define WIDTH 60000u

bool_t b2;

void fixed_pulse(void)
{
    uint16_t off_time16 = DELAY + WIDTH; /* Non-compliant */
}

void f2()
{

}

void g2(void)
{
    uint16_t y = b2 ? 0u : (0u - 1u); /* Non-compliant */
}

void h2(void)
{

}

int fake_main()
{
    uint16_t x = 0;
    switch (x)
    {
    case BASE + 0u:
        f2();
        break;
    case BASE + 1u:
        g2();
        break;
    case BASE + 512u:   /* Non-compliant - wraps to 0 */
        h2();
        break;
    }
       
    return 0;
}
