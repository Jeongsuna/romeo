#include <cstdint>
#include <string.h>

int16_t a[20];
int16_t b[20];

void f(void)
{
	memcpy(&a[5], &b[4], 2u * sizeof(a[0]));  /* Compliant */
}

void g(void)
{
	int16_t* p = &a[0];
	int16_t* q = &a[0];

	*p = *q;    /* Compliant - exception */
}

int main()
{
	return 0;
}