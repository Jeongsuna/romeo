#include <errno.h>

typedef double float64_t;

void f2(void)
{
    float64_t f64;

    errno = 0;

    f64 = atof("A.12");

    if (0 == errno)         /* Non-compliant */
    {
        /* f64 may not have a valid value in here. */
    }

    errno = 0;

    f64 = strtod("A.12", NULL);

    if (0 == errno)         /* Compliant */
    {
        /* f64 will have a valid value in here. */
    }
}

int fake_main()
{
    f2();
    return 0;
}