#include <stddef.h>
#include <cstdint>

void f1_2(int32_t* ptr)
{
	int32_t a1[10];
	int32_t a2[10];
	int32_t* p1 = &a1[1];
	int32_t* p2 = &a2[10];
	ptrdiff_t diff;

	diff = p1 - a1;     /* Compliant */
	diff = p2 - a2;     /* Compliant */
	diff = p1 - p2;     /* Non-compliant */
	diff = ptr - p1;    /* Non-compliant */
}

int fake_main() {
	f1_2(0);
	return 0;
}