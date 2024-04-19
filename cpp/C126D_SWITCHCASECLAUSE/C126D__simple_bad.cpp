#include <stdio.h>

void C126D(int x)
{
    switch (x)
    { // Non-Compliant
    default:
        printf("One\n");
    }
}

int main()
{
    return 0;
}