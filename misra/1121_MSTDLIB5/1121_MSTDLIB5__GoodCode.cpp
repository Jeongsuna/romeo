#include <cstdint>
/* Compliant */

extern void use_int16(int16_t use_int16_param) {};

void mc2_2008(void)
{
	int16_t mc2_2008_signal = 0;

	use_int16(mc2_2008_signal);
}

int main() {
	mc2_2008();
	return 0;
}