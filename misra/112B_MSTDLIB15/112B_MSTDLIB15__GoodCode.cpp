#include <stdio.h>
#include <string.h>
#include <cstdint>

void f(uint8_t s1[8], uint8_t s2[8])
{
	(void)memcpy(s1, s2, 8);   /* Compliant */
}

int main()
{
	return 0;
}