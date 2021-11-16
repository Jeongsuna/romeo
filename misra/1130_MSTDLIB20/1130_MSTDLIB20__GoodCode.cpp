#include <clocale>
#include <stdio.h>
#include <cstring>

void f1(void)
{
	const char* res1;
	const char* res2;
	char copy[128];

	res1 = setlocale(LC_ALL, 0);

	(void)strcpy_s(copy, res1);

	res2 = setlocale(LC_MONETARY, "French");

	printf("%s\n", copy);  /* Compliant - copy made before subsequent call */
	printf("%s\n", res2);  /* Compliant - no subsequent call before use */
}
int main() {
	f1();
	return 0;
}