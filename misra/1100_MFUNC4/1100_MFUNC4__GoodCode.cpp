#include <cstdint>

uint16_t lookup(uint16_t v)
{
	if ((v < 0u) || (v > 10u))
	{
	}
	return v; /* Compliant */
}
int main() {
	lookup(0);
	return 0; /* Compliant */
}