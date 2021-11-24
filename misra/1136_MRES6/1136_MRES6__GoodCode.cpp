#include <stdio.h>

int error_action()
{
    return 0;
}

void fn(void)
{
    FILE* fp;
    void* p;

    fp = fopen("tmp", "w");

    if (fp == NULL)
    {
        error_action();
    }

    fprintf(fp, "?");    /* Compliant */
    p = fp;                 /* Compliant */

    fclose(fp);
}

int main()
{
    fn();
    return 0;
}