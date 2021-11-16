#include <arm64_neon.h>
int16_t x;
int errorflag;

int main()
{
    switch (x)
    {
    case 0:
        ++x;
        break;
    case 1:
    case 2:
        break;
    default:          /* Compliant - default label is present */
        errorflag = 1;  /* should be non-empty if possible */
        break;
    }

    return 0;
}