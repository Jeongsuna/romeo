#include <stdio.h>
#include <string.h>
#include <cstdint>

/*
 * Is it intentional to only copy part of 's2'?
 */
void f2(uint8_t s1[8], uint16_t s2[8])
{
	(void)memcpy(s1, s2, 8);   /* Non-compliant */
}

int fake_main()
{
	return 0;
}