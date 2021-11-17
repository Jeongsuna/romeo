// 메인 추가
#include<stdio.h>

void f1(void)
{
	char input[128];
	(void)scanf("%128c", input);
	(void)printf("%s", input); /* Non-compliant */
}

int main() {

	f1();

	return 0;

}