#include <stdio.h>

int main() {
	int i;
	int *p;
	int a[10] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110 };

	p = &a[0];

	for (i = 0; i < 10; ++i) /* Compliant */
	{
		++p;
	}

	return 0;
}