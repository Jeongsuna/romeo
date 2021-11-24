#include <stdio.h>
#include <string.h>
#include <cstdint>

char string[] = "Short";

void f1(const char* str)
{
    (void)strcpy(string, "blue");      /* Compliant */

    /*
     * Compliant use of strcpy as 'string' is only modified if 'str' will fit.
     */
    if (strlen(str) < (sizeof(string) - 1u))
    {
        (void)strcpy(string, str);
    }
}

size_t f2(void)
{
    char text[6] = "Token";     /* Compliant */

    return strlen(text);
}

int main()
{
    return 0;
}