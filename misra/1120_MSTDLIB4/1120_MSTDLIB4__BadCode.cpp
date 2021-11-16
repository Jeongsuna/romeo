#include <cstdint>
#include <setjmp.h>

extern void use_int16(int16_t use_int16_param) {};
static jmp_buf mc2_2007_myenv;
static void mc2_2007_func(int8_t p);

void mc2_2007(void)
{
	int16_t mc2_2007_istat = 0;

	if (!setjmp(mc2_2007_myenv)) /* Not Compliant rule 20.7 */
	{
		mc2_2007_func(10);
	}
	else
	{
	}
	use_int16(mc2_2007_istat);
}

static void mc2_2007_func(int8_t p)
{
	if (p == 10)
	{
		longjmp(mc2_2007_myenv, 9);
	}
}

int main() {
	mc2_2007();
	return 0;
}