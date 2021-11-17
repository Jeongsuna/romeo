#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void f1(void)
{
    char input[128];
	scanf("%s", input);

	try {
		if (strlen(input) >= 128) {
			throw 0;
		}
		else {
			printf("%s", input); /* Compliant */
		}
	}
	catch(int x){
		printf("Overflow");
		exit(0);
	}
}

int fake_main() {
	f1();
	return 0;
}