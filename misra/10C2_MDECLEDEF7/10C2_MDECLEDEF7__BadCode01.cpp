#include <cstdint>
/* file1.c */
int32_t count; /* Non-compliant - "count" has external linkage */
void foo(void) /* Non-compliant - "foo" has external linkage */
{
	int16_t index; /* "index" has no linkage */
	if (count == 10)
	{
	}
}
void bar1(void)
{
	int16_t index; /* "index" has no linkage */
}
/* End of file1.c */