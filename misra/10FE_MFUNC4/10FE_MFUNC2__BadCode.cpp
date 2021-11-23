#include <stdio.h>
#include <cstdint>

void f1(void);
void f2(void);
void f3(void);
int16_t i = 0;
int16_t j = 0;

int main(void)
{
	f1();
	f2();
	return 0;
}
void f1(void)
{
	printf("This is f1.\n");
	i++;
	if (i == 5) return;
	f1();           /* Non-compliant - f1 calls itself directly. */
}

void f2(void)
{
	printf("This is f2.\n");
	f3();           /* Non-compliant - f2 calls itself by f3 indirectly. */
}

void f3(void)
{
	printf("This is f3.\n");
	j++;
	if (j == 10) return;
	f2();           /* Non-compliant - f3 calls itself by f2 indirectly. */
} 