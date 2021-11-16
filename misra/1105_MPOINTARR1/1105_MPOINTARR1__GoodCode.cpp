#include <cstdint>

int32_t f1(int32_t* const a1, int32_t a2[10])
{
	int32_t* p = &a1[0];    /* Compliant */
	return *(a2 + 9);      /* Compliant */
}

void f2(void)
{
	int32_t data = 0;
	int32_t b = 0;
	int32_t c[10] = { 0 };
	int32_t d[5][2] = { 0 };  /* 5-element array of 2-element arrays
									* of int32_t */

	int32_t* p1 = &c[0];        /* Compliant */

	data = f1(&b, c);
	data = f1(c, c);

	p1++;                          /* Compliant */

	data = *(&data + 0);        /* Compliant - C treats data as an
									* array of size 1 */
	d[3][1] = 0;               /* Compliant */
	data = *(*(d + 3) + 1);   /* Compliant */

	p1 = d[1];                    /* Compliant */
	data = p1[1];                 /* Compliant - p1 address an array
									 * of size 2 */
}

struct
{
	uint16_t x;
	uint16_t y;
	uint16_t z;
	uint16_t a[10];
} s;

uint16_t* p;

void f3(void)
{
	p = &s.x;
	++p;                              /* Compliant - p points one beyond s.x */
	p = &s.a[0];                      /* Compliant - p points into s.a */
	p = p + 8;                          /* Compliant - p still points into s.a */
}

int main() {
	f2();
	f3();
	return 0;
}