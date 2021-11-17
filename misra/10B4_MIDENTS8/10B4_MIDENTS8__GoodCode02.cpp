/* file2.c */
#include <cstdint>
static void foo3(void)
{
    int32_t index; /* Compliant - "index" has no linkage */
}
int fake_main2()
{
    return 0;
}