/* file2.c */
#include <cstdint>
static void foo2(void)
{
    int32_t index; /* Compliant - "index" has no linkage */
}
int main()
{
    return 0;
}