#include <errno.h>
#include <stdio.h>

int errnoSettingFunction1()
{
    return 0;
}

int someFunction()
{
    return 0;
}

int errnoSettingFunction2()
{
    return 0;
}

int handleError(int x)
{
    return x;
}


void f1(void)
{
    errno = 0;

    errnoSettingFunction1();      /* Compliant */

    if (0 != errno)
    {
    }

    someFunction();

    if (0 != errno)
    {
    }

    errno = 0;

    errnoSettingFunction2();     /* Compliant */

    if (0 != errno)
    {
    }
}

void f2(FILE* f, fpos_t* pos)
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
        handleError(errno);
    }
}

int main()
{
    return 0;
}