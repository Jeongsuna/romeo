#include <cstdint>

#define Sum(x, y) ( ( x ) + ( y ) )
int16_t Plus; /* Compliant */

#define Sum(x, y) ( ( x ) + ( y ) )
int16_t z = Sum(1, 2); /* Compliant */

#define low_pressure_turbine_temperature_1 lp_tb_temp_1
static int32_t low_pressure_turbine_temp_2; /* Compliant */

int main() 
{
    return 0;
}