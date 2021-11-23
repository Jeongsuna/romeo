#include <cstdint>

void fn1(void)
{
	uint8_t a[10];
	uint8_t* ptr;
	uint8_t index = 0U;

	index = index + 1U;     /* Compliant - rule only applies to pointers */

	a[index] = 0U;      /* Compliant */
	ptr = &a[5];        /* Compliant */

	ptr = a;
	ptr++;              /* Compliant - increment operator not + */
	*(ptr + 5) = 0U;  /* Non-compliant */
	ptr[5] = 0U;      /* Compliant */
}

void fn3(void)
{
	uint16_t p1[] = { 1,2,3,4,5 };
	p1[1]++;         /* Compliant */
	p1[1] = p1[1] + 5;  /* Non-compliant */
	p1[5] = 0U; /* Compliant */

	uint16_t p2[] = { 6,7,8,9,10 };
	p2[2]++;         /* Compliant */
	p2[2] = p2[2] + 3;  /* Non-compliant */
	p2[3] = 0U; /* Compliant */
}

uint8_t a1[16];
uint8_t a2[16];
uint8_t data = 0U;

void fn4(void)
{
	fn3();
	fn3();
}

int fake_main()
{
	return 0;
}