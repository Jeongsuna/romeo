#include <stdio.h>

int a, b, c;
int f(a, b, c)
{
	return 0;
}

int main()
{
	int i;
	int* p;
	int N = 10;
	int a[10] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110 };

	p = &a[0];
	
	f((1, 2), 3); /* Non-compliant - how many parameters? */
	
	for (int i = 0, p = &a[0]; i < N; ++i, ++p)
	{
	}

	return 0;
}