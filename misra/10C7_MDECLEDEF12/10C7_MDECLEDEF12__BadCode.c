// #include <stdio.h> �߰�
// main() �߰�

#include <stdio.h>

/* Non-compliant - yellow replicates implicit green */
enum colour { red = 3, blue, green, yellow = 5 };

int main()
{
	return 0;
}