#include <cstdint>
int main() {
	void* p;

	uint32_t u = 0x1234u;
	uint32_t *ptr1 = &u;
	p = ptr1; /* Compliant */

	float uu = 1024.0f;
	float *ptr2 = &uu;
	p = ptr2; /* Compliant */

	return 0;
}