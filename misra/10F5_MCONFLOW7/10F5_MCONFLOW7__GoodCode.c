#include <stdio.h>

int fake_main() {
	int i = 0;

	if (i == 5)
	{
		printf("i�� 5�Դϴ�.");
	}
	else if (i == 10)
	{
		printf("i�� 10�Դϴ�.");
	}
	else
	{
		; /* No action required - ; is optional */
	}

	return 0;
}