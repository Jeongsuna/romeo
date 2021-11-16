#include <stdio.h>

int x = 0;

int main()
{
    switch (x)
    {
    default:    /* Compliant - default is the first label */
    case 0:
        ++x;
        break;
    case 1:
    case 2:
        break;
    }

    switch (x)
    {
    case 0:
        ++x;
        break;
    case 1:
    case 2:
        break;
    default:    /* Compliant - default is the final label */
        x = 0;
        break;
    }

    return 0;
}