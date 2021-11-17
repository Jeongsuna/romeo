#include <stdio.h>

int z;

int fake_main()
{
    switch (z)
    {
    case 1:
        z = 2;
        break;
    default:    /* Compliant */
        z = 0;
        break;
    }

    return 0;
}