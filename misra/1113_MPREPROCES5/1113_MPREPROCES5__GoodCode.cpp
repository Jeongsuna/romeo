#include <cstdint>
#define QUALIFIER volatile

/* Compliant */
void f(QUALIFIER int32_t p)
{
	while (p != 0)
	{
		p = 0;
	}
}
int main() {
	f(3);
	return 0;
}