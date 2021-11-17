#include <cstdint>
static int32_t count; /* Compliant - "count" has internal linkage */
static void foo(void) /* Compliant - "foo" has internal linkage */
{
	int16_t index; /* "index" has no linkage */
	if (count == 10)
	{
	}
}
void bar1_2(void)
{
	int16_t index; /* "index" has no linkage */
}
int fake_main(void)
{
	count = 0;
	for (int16_t i = 0; i < 10; i++)
	{
		if ((i % 2) == 0)
		{
			foo();
		}
	}
	return 0;
}
