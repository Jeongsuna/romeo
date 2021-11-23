#include <stdio.h>

typedef unsigned short int uint16_t;

uint16_t x = 0u;

//extern void p(uint16_t a[2]);

void f(void)
{
	/* Non-compliant - volatile access is persistent side effect */
	volatile uint16_t v1 = 0;
	uint16_t a[2] = { v1, 0 };
}

void p(uint16_t a[2])
{
	/* Non=compliant - two side effects */
	p((uint16_t[2]) { x++, x++ });

}

void h(void)
{
	/* Non=compliant - two side effects */
	p((uint16_t[2]) { x++, x++ });
}



int fake_main()
{
	return 0;
}