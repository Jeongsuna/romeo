#include <stddef.h>
#include <cstdint>

void f1(int32_t* ptr)
{
	int32_t a1[10];
	int32_t a2[10];
	int32_t* p1 = &a1[1];
	int32_t* p2 = &a2[10];
	ptrdiff_t diff;

	diff = p1 - a1;     /* Compliant */
	diff = p2 - a2;     /* Compliant */

}
int main() {
	f1(0);
	return 0;
}