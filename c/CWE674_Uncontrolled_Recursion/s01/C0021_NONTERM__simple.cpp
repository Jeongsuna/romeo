#include <stdlib.h>
#include <stdio.h>
int factorial(int i) {
	//재귀함수 탈출 조건을 설정하지 않아 무한루프가 된다.
	return i * factorial(i - 1);
}
int C0021_NONTERM(){
	int i;
	char szInput[256];
	printf("숫자를 입력하세요 : ");
	fgets(szInput, 256, stdin);

	i = atoi(szInput);
	if (i <= 0) {
		fputs("0 보다 큰 수를 입력하세요.", stderr);
	}
	else {
		printf("%d! = %d\n", i, factorial(i));
	}
	return 0;
}
