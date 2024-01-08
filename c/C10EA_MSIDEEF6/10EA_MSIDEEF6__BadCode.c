#include <stdint.h>
#include <stddef.h>

volatile uint32_t  v;

void f(int32_t n)
{
	size_t s;

	s = sizeof(int32_t[n++]);      /* Non-compliant */
	s = sizeof(void  (*[n]) (int32_t a[v])); /* Non-compliant */
}

int fake_main()
{
	int32_t j;
	size_t s;

	s = sizeof(j++);   /* Non-compliant */

	return 0;
}
