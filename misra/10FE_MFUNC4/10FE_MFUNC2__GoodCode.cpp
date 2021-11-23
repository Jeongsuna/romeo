#include <stdio.h>
#include <cstdint>

void f1_2(void);
void f2_2(void);
void f3_2(void);
int16_t i2 = 0;
int16_t j2 = 0;

int fake_main(void)
{
	f1_2();
	f2_2();
	return 0;
}
void f1_2(void)
{
	printf("This is f1.\n");
	i2++;
	if (i2 == 5) return;
}

void f2_2(void)
{
	printf("This is f2.\n");
	f3_2(); /* Compliant */
}

void f3_2(void)
{
	printf("This is f3.\n");
	j2++;
	if (j2 == 10) return;
}