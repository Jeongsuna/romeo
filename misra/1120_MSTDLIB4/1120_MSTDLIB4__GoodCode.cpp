#include <cstdint>
/* Compliant */

extern void use_int16(int16_t use_int16_param) {};
static void mc2_2007_func(int8_t p)
{
	if (p == 10) {}
}

void mc2_2007(void)
{
	int16_t mc2_2007_istat = 0;

	mc2_2007_func(10);

	use_int16(mc2_2007_istat);
}

int main() {
	mc2_2007();
	return 0;
}