#include <cstdint>
extern volatile uint16_t v {};
extern char* p {};
void f(void)
{
    (void)v;        /* Compliant -v is accessed for its side effect
                    *       and the cast to void is permitted
                    *       by exception        */

    (*p)++;      /* Compliant    - *p is incremented */
}

int main()
{
	f();
    return 0;
}