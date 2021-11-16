#include <cstdint>
#include <stdlib.h>

extern void use_float64(double use_float64_param) {};
extern void use_int32(int32_t use_int32_param) {};
extern void use_int64(int64_t use_int64_param) {};

void  mc2_2010(void)
{
	double mc2_2010_a_to_float_result;
	int32_t   mc2_2010_a_to_int_result;
	int64_t   mc2_2010_a_to_long_result;

	mc2_2010_a_to_float_result = atof("123.5"); /* Not Compliant rule 20.10*/
	mc2_2010_a_to_int_result = atoi("12345");   /* Not Compliant rule 20.10*/
	mc2_2010_a_to_long_result = atol("12345");  /* Not Compliant rule 20.10*/

	use_float64(mc2_2010_a_to_float_result);
	use_int32(mc2_2010_a_to_int_result);
	use_int64(mc2_2010_a_to_long_result);
}

int main() {
	mc2_2010();
	return 0;
}