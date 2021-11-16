// #include <stdio.h> 추가
// #include <arm64_neon.h> 추가
// main() 추가
// 솔루션을 ARM64로 설정 후 빌드
// {, } 제거

#include <stdio.h>
#include <arm64_neon.h>


#define Sum(x, y) ( ( x ) + ( y ) )
int16_t Sum; /* Non-compliant */


#define Sum(x, y) ( ( x ) + ( y ) )
	int16_t x = Sum(1, 2); /* Non-compliant */


#define low_pressure_turbine_temperature_1 lp_tb_temp_1
	static int32_t low_pressure_turbine_temperature_2; /* Non-compliant */


int main()
{
	return 0;
}