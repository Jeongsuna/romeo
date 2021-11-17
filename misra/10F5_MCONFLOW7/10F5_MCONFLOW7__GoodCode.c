#include <stdio.h>

int fake_main() {
	int i = 0;

	if (i == 5)
	{
		printf("i는 5입니다.");
	}
	else if (i == 10)
	{
		printf("i는 10입니다.");
	}
	else
	{
		; /* No action required - ; is optional */
	}

	return 0;
}