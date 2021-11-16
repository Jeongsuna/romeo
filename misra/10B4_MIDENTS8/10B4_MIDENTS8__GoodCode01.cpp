/* file1.c */
#include <cstdint>
int32_t count; /* "count" has external linkage */
void foo(void) /* "foo" has external linkage */
{
    int16_t index; /* "index" has no linkage */
}