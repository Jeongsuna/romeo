#include <stdio.h>

int x2 = 0;

int fake_main()
{
    switch (x2)
    {
    default:    /* Compliant - default is the first label */
    case 0:
        ++x2;
        break;
    case 1:
    case 2:
        break;
    }

    switch (x2)
    {
    case 0:
        ++x2;
        break;
    case 1:
    case 2:
        break;
    default:    /* Compliant - default is the final label */
        x2 = 0;
        break;
    }

    return 0;
}