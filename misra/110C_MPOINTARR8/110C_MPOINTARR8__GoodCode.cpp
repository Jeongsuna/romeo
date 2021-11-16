#include <cstdint>

void f(int16_t n)
{
	uint16_t vla[10]; /* Compliant */
}

void g(void)
{
	f(10);
}

void h(uint16_t n,
	uint16_t a[10][20]) /* Compliant */
{
	uint16_t(*p)[20];
	p = a;
}

int main() {
	g();
	h(0, 0);
	return 0;
}