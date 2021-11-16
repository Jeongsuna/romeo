#include <stdio.h>

int x = 0;

int main()
{
    switch (x)
    {
    case 0:
        ++x;
        break;
    default:    /* Non-compliant - default is mixed with the case labels */
        x = 0;
        break;
    case 1:
    case 2:
        break;
    }

    return 0;
}