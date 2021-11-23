/* file2.c */
#include <cstdint>
static void foo4(void)
{
    int32_t index; /* Compliant - "index" has no linkage */
}
int main2()
{
    return 0;
}