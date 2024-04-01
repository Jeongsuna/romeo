#include <cstdint>

extern int engine_exhaust_gas_temperature_raw;
void f2(void)
{
    int engine_exhaust_gas_temperature_local; /* Compliant */
}
static int engine_exhaust_gas_temp_raw;
static int engine_exhaust_gas_temp_scaled; /* Compliant */

int fake_main()
{
	f2();
    return 0;
}