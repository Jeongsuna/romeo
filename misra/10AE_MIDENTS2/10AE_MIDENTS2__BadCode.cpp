#include <cstdint>
//C90
extern int engine_exhaust_gas_temperature_raw;
static int engine_exhaust_gas_temperature_scaled; /* Non-compliant */
void f(void)
{
	int engine_exhaust_gas_temperature_local; /* Compliant */
}

static int engine_exhaust_gas_temp_raw;
static int engine_exhaust_gas_temp_scaled; /* Compliant */

//C99
extern int engine_exhaust_gas_temperature_engine_exhaust_gas_temperature_raw;
static int engine_exhaust_gas_temperature_engine_exhaust_gas_temperature_scaled; /* Non-compliant */
void f(void)
{
	int engine_exhaust_gas_temperature_engine_exhaust_gas_temperature_local;
    int engine_exhaust_gas_temperature_engine_exhaust_gas_temperature_locale; /* Non-compliat */
}
int main() {
	f();
	return 0;
}