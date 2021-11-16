#include <stdio.h>
#include <cstdint>

int main(void) {
	/* num is changed by user */
	int16_t num = 3;
	for (int16_t i = 0; i < 10; i++)
	{
		if ((num > 0) && (num < 5))
		{
			printf("A part\n"); /* compliant */
		}
		else if (num == 5)
		{
			printf("B part\n"); /* compliant */
		}
		else if (num > 5)
		{
			printf("C part\n"); /* compliant */
		}
	}
	
	printf("D part\n"); /* compliant */

	return 0;
}