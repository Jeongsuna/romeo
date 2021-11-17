/* file1.c */
#include <cstdint>
int32_t count2; /* "count" has external linkage */
void foo2(void) /* "foo" has external linkage */
{
    int16_t index; /* "index" has no linkage */
}