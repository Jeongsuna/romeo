#include <cstdint>
/* Compliant */

extern void use_char_ptr2(char* use_char_ptr_param) {};

void mc2_2011_2(void)
{
	int32_t mc2_2011_status = 0;
	char* mc2_2011_env = NULL;

	if (mc2_2011_status == 0){}

	if (mc2_2011_status == 1){}

	use_char_ptr2(mc2_2011_env);
}

int fake_main() {
	mc2_2011_2();
	return 0;
}