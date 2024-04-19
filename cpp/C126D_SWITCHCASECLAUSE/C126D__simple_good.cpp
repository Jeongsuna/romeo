#include <stdio.h>

void C126D(int x)
{
    switch (x)
    { // Compliant
    case 1:
        printf("One\n");
        break;
    default:
        break;
    }

    switch (x)
    { // Compliant
    case 1:
    default:
        printf("One\n");
    }

    switch (x)
    { // Compliant
    case 1:
    case 2:
        printf("One\n");
    }
}

int main()
{
    return 0;
}