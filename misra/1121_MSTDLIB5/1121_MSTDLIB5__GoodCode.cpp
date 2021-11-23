#include <cstdint>
/* Compliant */

extern void use_int16_2(int16_t use_int16_param) {};

void mc2_2008_2(void)
{
	int16_t mc2_2008_signal = 0;

	use_int16_2(mc2_2008_signal);
}

int fake_main() {
	mc2_2008_2();
	return 0;
}