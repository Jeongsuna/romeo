#include <stdio.h>

int z;

int main()
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