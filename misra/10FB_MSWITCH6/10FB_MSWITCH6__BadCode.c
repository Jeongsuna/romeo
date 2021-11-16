#include <stdio.h>

int x;
int y;

int main()
{
    switch (x)
    {
    default:    /* Non-compliant - switch is redundant */
        x = 0;
        break;
    }

    switch (y)
    {
    case 1:
    default:    /* Non-compliant - switch is redundant */
        y = 0;
        break;
    }

    return 0;
}