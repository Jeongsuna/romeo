#include <errno.h>

int errnoSettingFunction1_2()
{
    return 0;
}

int errnoSettingFunction2_2()
{
    return 0;
}

int errnoSettingFunction3_2()
{
    return 0;
}

void f2(void)
{
    errnoSettingFunction1_2();      /* Non-compliant */

    if (0 == errno)
    {
        errnoSettingFunction2_2();     /* Compliant by exception */

        if (0 == errno)
        {
        }
    }

    else
    {
        errno = 0;

        errnoSettingFunction3_2();     /* Compliant */

        if (0 == errno)
        {
        }
    }
}

int fake_main()
{
    f2();
    return 0;
}