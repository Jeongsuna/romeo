#include <errno.h>

typedef double float64_t;

void f(void)
{
    float64_t f64;

    errno = 0;

    f64 = atof("A.12");

    /* atof() is not errno-setting-function */

    f64 = strtod("A.12", NULL);

    if (0 == errno)         /* Compliant */
    {
        /* f64 will have a valid value in here. */
    }
}

int main()
{
    f();
    return 0;
}