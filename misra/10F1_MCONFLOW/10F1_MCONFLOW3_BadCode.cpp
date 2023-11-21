#include <cstdint>
void f1(int32_t a)
{
    if (a <= 0)
    {
        goto L2;    /* Non-compliant */
    }

    goto L1;      /* Compliant */

    if (a == 0)
    {
        goto L1;    /* Compliant */
    }

    goto L2;      /* Non-compliant */

L1:
    if (a > 0)
    {
    L2:
        ;
    }
}

int main()
{
    f1(0);

    int x = 0;
    int y = 0;

    switch (x)
    {
    case 0:
        if (x == y)
        {
            goto L1; /* Non-compliant */
        }
        break;
    case 1:
        y = x;
    L1:
        ++x;
        break;
    default:
        break;
    }
    return 0;
}