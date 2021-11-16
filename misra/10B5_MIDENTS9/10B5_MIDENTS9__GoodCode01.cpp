/* file1.c */
#include <cstdint>
static int32_t count; /* "count" has internal linkage */
static void foo(void) /* "foo" has internal linkage */
{
    int16_t index; /* "index" has no linkage */
}
void bar1(void)
{
    int16_t index; /* Compliant - "index" is not unique but
                    * has no linkage */
    foo();
}
/* End of file1.c */