#include <clocale>
#include <stdio.h>
#include <cstring>

void f1_2(void)
{
    const char* res1;
    const char* res2;
    char copy[128];

    res1 = setlocale(LC_ALL, 0);

    (void)strcpy(copy, res1);

    res2 = setlocale(LC_MONETARY, "French");

    printf("%s\n", res1);       /* Non-compliant - use after subsequent call */
    printf("%s\n", copy);       /* Compliant - copy made before subsequent call */
    printf("%s\n", res2);       /* Compliant - no subsequent call before use */
}
int fake_main() {
    f1_2();
    return 0;
}