#include <stdio.h>

int error_action2()
{
    return 0;
}

void fn2(void)
{
    FILE* fp;
    void* p;

    fp = fopen("tmp", "w");

    if (fp == NULL)
    {
        error_action2();
    }

    fclose(fp);

    fprintf(fp, "?");    /* Non-compliant */
    p = fp;                 /* Non-compliant */
}

int fake_main()
{
    fn2();
    return 0;
}