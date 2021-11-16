#include <stdio.h>

int x;
int a;
int b;

int main()
{
    switch (x)
    {
    case 0:
        a = b;    /* Non-compliant - break omitted */
    case 1:
        if (a == b)
        {
            ++a;
            break;   /* Non-compliant - conditional break */
        }
    default:
        ;           /* Non-compliant - default must also have a break */
    }

    return 0;
}