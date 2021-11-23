#include <cstdint>
/* Compliant */

extern void use_int16_2(int16_t use_int16_param) {};
static void mc2_2007_func_2(int8_t p)
{
	if (p == 10) {}
}

void mc2_2007_2(void)
{
	int16_t mc2_2007_istat = 0;

	mc2_2007_func_2(10);

	use_int16_2(mc2_2007_istat);
}

int fake_main() {
	mc2_2007_2();
	return 0;
}