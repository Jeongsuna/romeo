#include <cstdint>
#define bool_t bool


const uint16_t c = 0xffffu;

void f(void)
{
	uint16_t y = c + 1u;  /* Compliant */
}

bool_t b;

void g(void)
{
	uint16_t x = (0u == 0u) ? 0u : (0u, 1u); /* Compliant */
}

int main()
{
	return 0;
}