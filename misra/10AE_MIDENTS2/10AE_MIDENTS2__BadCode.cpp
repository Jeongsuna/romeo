#include <cstdint>
extern int engine_exhaust_gas_temperature_raw;
static int engine_exhaust_gas_temperature_scaled; /* Non-compliant */
void f(void)
{
	int engine_exhaust_gas_temperature_local; /* Compliant */
}
static int engine_exhaust_gas_temp_raw;
static int engine_exhaust_gas_temp_scaled; /* Compliant */
int main() {
	f();
	return 0;
}