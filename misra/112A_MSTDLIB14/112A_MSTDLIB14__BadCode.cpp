#include <stdio.h>
#include <string.h>

char buffer1[12];
char buffer2[12];

void f1(void)
{
    (void)strcpy(buffer1, "abc");
    (void)strcpy(buffer2, "abc");

    /* The following use of memcmp is non-compliant */
    if (memcmp(buffer1, buffer2, sizeof(buffer1)) != 0)
    {
        /* The strings stored in buffer1 and buffer2 are reported to be
         * different, but this may actually be due to differences in The
         * uninitialises characters stored after the null terminators.
         */
    }
}

int fake_main()
{
    f1();
    return 0;
}
