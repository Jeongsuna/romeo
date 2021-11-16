#include <cstdint>
extern int32_t engine_exhaust_gas_temperature_raw;
static int32_t engine_exhaust_gas_temperature_scaled; /* Non-compliant */
void f(void)
{
	int32_t engine_exhaust_gas_temperature_local; /* Compliant */
}
static int32_t engine_exhaust_gas_temp_raw;
static int32_t engine_exhaust_gas_temp_scaled; /* Compliant */
int main() {
	f();
	return 0;
}