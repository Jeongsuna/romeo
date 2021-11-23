#define M( A ) printf ( #A )

#include <stdio.h>

void fake_main(void)
{
    M(
#ifdef SW       /* Non-compliant */
        "Message 1"
#else           /* Non-compliant */
        "Message 2"
#endif          /* Non-compliant */
    );
}