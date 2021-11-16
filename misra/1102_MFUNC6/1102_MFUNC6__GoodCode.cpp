#include <cstdint>
/* Compliant */
uint16_t total(uint16_t n, uint16_t a[20])
{
	uint16_t i;
	uint16_t sum = 0U;

	/* Undefined behaviour if a has fewer than 20 elements */
	for (i = 0U; i < n; ++i)
	{
		sum = sum + a[i];
	}

	return sum;
}

extern uint16_t v2[20]{};

void g(void)
{
	uint16_t x;
	x = total(20U, v2); /* Compliant */
}

int main() {
	g();
	return 0;
}