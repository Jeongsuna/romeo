#include <cstdint>
void f(void)
{
	int32_t j = 0;

	if (10 == j)
	{
		goto L2;      /* Compliant */
	}
L2:
	++j;
}
int main() {
	f();
	return 0;
}