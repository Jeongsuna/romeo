#include <stdint.h>
#include <stddef.h>

void f(int32_t n)
{
    size_t s;

    s = sizeof(int32_t[n]);        /* Compliant */
}

int main()
{
    volatile int32_t i;
    int32_t j;
    size_t s;

    s = sizeof(j);     /* Compliant */
    s = sizeof(i);     /* Compliant - exception */
    s = sizeof(int32_t);   /* Compliant */

    return 0;
}