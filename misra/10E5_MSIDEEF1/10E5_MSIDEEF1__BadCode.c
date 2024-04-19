#include <stdio.h>
#include <stdint.h>

typedef unsigned short int uint16_t;

uint16_t x = 0u;

void f(void)
{
	/* Non-compliant - volatile access is persistent side effect */
	volatile uint16_t v1 = 0;
	uint16_t a[2] = { v1, 0 };
}

void p(uint16_t a)
{
	/* Non-compliant - two side effects */
	uint16_t p_var[2] = { x++, x++ };

}

int fake_main()
{
	return 0;
}