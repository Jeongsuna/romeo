#include <stdio.h>
#include <string.h>

char string2[] = "Short";

void f1_2(const char *str)
{
    /*
     * Non-compliant use of strcpy as it results in writes beyond the end of 'string'
     */
    (void)strcpy(string2, "Too long to fit");

    /*
     * Compliant use of strcpy as 'string' is only modified if 'str' will fit.
     */
    if (strlen(str) < (sizeof(string2) - 1u))
    {
        (void)strcpy(string2, str);
    }
}

size_t f2_2(void)
{
    char text[5] = "Token";

    /*
     * The following is non-compliant as it results in reads beyond
     * the end of 'text' as there is no null terminator.
     */
    return strlen(text);
}

int fake_main()
{
    return 0;
}