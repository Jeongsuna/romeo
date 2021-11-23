#include <stdio.h>
#include <time.h>
#include <wchar.h>

int fake_main(void)
{
    struct tm* timeptr;
    wchar_t   dest[100];
    time_t temp;
    size_t    rc;

    temp = time(NULL);                                     /* Non-compliant - use of time() from time.h */
    timeptr = localtime(&temp);                            /* Non-compliant - use of localtime() from time.h */
    rc = wcsftime(dest, sizeof(dest), L" Today is %A,"
        L" %b %d.\n Time: %I:%M %p", timeptr);   /* Non-compliant - use of wcsftime() from time.h */
    printf("%d characters placed in string to make:\n\n%ls\n", rc, dest);
    return 0;
}