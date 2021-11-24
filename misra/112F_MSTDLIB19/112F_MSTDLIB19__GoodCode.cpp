#include <stdio.h>
#include <string.h>
#include <stddef.h>
#include <locale.h>

void f2(void)
{
    char str[128];

    (void)strcpy(str,
        setlocale(LC_ALL, 0));  /* Compliant - 2nd parameter to
                                    * strcpy takes a const char * */
    const struct lconv* conv = localeconv();     /* Compliant */

    conv->decimal_point[2] = "^";                  /* Constraint violation */
}

int main()
{
    return 0;
}