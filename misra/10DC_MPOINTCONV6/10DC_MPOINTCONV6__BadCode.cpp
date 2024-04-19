#include <cstdint>

int main() {
	void* p;
	uint32_t u;
	float f = 1024.0;
	/* Non-compliant - implementation-defined */
	p = (void*)0x1234u;

	/* Non-compliant - undefined */
	p = (void*&)f;

	/* Non-compliant - implementation-defined */
	u = (uint32_t)p;

	return 0;
}