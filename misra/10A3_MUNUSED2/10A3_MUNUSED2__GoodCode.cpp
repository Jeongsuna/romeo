#include <cstdint>
extern volatile uint16_t v2 {};
extern char* p2 {};
void f2(void)
{
    (void)v2;        /* Compliant -v is accessed for its side effect
                    *       and the cast to void is permitted
                    *       by exception        */

    (*p2)++;      /* Compliant    - *p is incremented */
}

int fake_main()
{
	f2();
    return 0;
}