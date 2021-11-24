#include <errno.h>
#include <stdio.h>

int errnoSettingFunction1_2()
{
    return 0;
}

int someFunction2()
{
    return 0;
}

int errnoSettingFunction2_2()
{
    return 0;
}

int handleError2(int x)
{
    return x;
}


void f1_2(void)
{
    errno = 0;

    errnoSettingFunction1_2();

    someFunction2();                /* Non-compliant - function call */

    if (0 != errno)
    {
    }

    errno = 0;

    errnoSettingFunction2_2();     /* Compliant */

    if (0 != errno)
    {
    }
}

void f2_2(FILE* f, fpos_t* pos)
{
    errno = 0;

    if (fsetpos(f, pos) == 0)
    {
        /* Compliant by exception -
         * no need to test errno as no out-of-band error reported.
         */
    }
    else
    {
        /* Something went wrong -
         * errno holds an implementation-defined positive value.
         */
        handleError2(errno);
    }
}

int fake_main()
{
    return 0;
}