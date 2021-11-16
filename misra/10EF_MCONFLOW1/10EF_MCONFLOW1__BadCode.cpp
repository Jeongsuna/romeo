#include <stdio.h>
#include <cstdint>

int main(void) {
	/* num is changed by user */
	int16_t num = 3;
	for (int16_t i = 0; i < 10; i++)
	{
		if ((num > 0) && (num < 5))
		{
			goto A;       /* Non-compliant */
		}
		else if (num == 5)
		{
			goto B;       /* Non-compliant */
		}
		else if (num > 5)
		{
			goto C;       /* Non-compliant */
		}
	}
	goto D;         /* Non-compliant */

A: printf("A part\n");
	goto E;
B: printf("B part\n");
C: printf("C part\n");
D: printf("D part\n");
E: printf("E part\n");
	return 0;
}