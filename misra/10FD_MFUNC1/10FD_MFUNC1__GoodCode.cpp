#include <cstdint>
/* Compliant */
void f(uint16_t n, ...)
{
	uint32_t x;
}

void g(void)
{
	f(1, 2.0, 3.0);
}

int main() {
	g();
	return 0;
}
