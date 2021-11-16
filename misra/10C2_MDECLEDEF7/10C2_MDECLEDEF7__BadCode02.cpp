#include <cstdint>
/* file2.c */
extern int32_t count;
extern void foo(void);

int main(void)
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
/* End of file2.c */