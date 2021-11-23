#include <cstdint>
/* Compliant */

extern void use_float64_2(double use_float64_param) {};
extern void use_int32_2(int32_t use_int32_param) {};
extern void use_int64_2(int64_t use_int64_param) {};

void  mc2_2010_2(void)
{
	double mc2_2010_a_to_float_result = 0;
	int32_t   mc2_2010_a_to_int_result = 0;
	int64_t   mc2_2010_a_to_long_result = 0;

	use_float64_2(mc2_2010_a_to_float_result);
	use_int32_2(mc2_2010_a_to_int_result);
	use_int64_2(mc2_2010_a_to_long_result);
}

int fake_main() {
	mc2_2010_2();
	return 0;
}