#include <cstdint>

uint8_t local_auto = 0; /* compliant */

uint8_t* func(void)
{
	return &local_auto;
}

uint16_t* sp;

void g(uint16_t u)
{
	sp = &u; /* compliant */
}

void h(void)
{
	static uint16_t* q = 0u; /* compliant */
}

int main() {
	func();
	g(3u);
	h();
	return 0;
}