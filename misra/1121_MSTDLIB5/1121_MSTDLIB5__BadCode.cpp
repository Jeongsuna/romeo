#include <cstdint>
#include <signal.h>               /* Not Compliant rule 20.8 */

extern void use_int16(int16_t use_int16_param) {};

void mc2_2008(void)
{
	int16_t mc2_2008_signal;

	mc2_2008_signal = SIGINT;       /* Not Compliant rule 20.8 */

	use_int16(mc2_2008_signal);
}

int main() {
	mc2_2008();
	return 0;
}