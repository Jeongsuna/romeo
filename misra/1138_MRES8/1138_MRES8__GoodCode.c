#include <errno.h>

int errnoSettingFunction1()
{
    return 0;
}

int errnoSettingFunction2()
{
    return 0;
}

int errnoSettingFunction3()
{
    return 0;
}


void f(void)
{
    errno = 0;

    errnoSettingFunction1();      /* Compliant */

    if (0 == errno)
    {
        errnoSettingFunction2();     /* Compliant by exception */

        if (0 == errno)
        {
        }
    }

    else
    {
        errno = 0;

        errnoSettingFunction3();     /* Compliant */

        if (0 == errno)
        {
        }
    }
}

int main()
{
    f();
    return 0;
}