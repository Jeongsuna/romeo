#include <arm_neon.h>
#include <exception>

void f(float32_t x, float32_t y)
{
	float32_t z;

	try { z = x / y; }
	catch(std::exception& e) {} /* Compliant */

	if (z > x)
	{
	}
	else
	{
		z = x * y;
	}
}
int main() {
	f(1, 1);
	return 0;
}