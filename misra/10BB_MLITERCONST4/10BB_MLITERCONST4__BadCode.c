// #include <stdio.h> 추가
// main() 추가
// 10BB_MLITERCONST4__extern.c 추가
// "0123456789"[0] = '*';는 구문오류로 주석처리함

#include <stdio.h>

// "0123456789"[0] = '*'; /* Non-compliant */
char* s = "string"; /* Non-compliant - s is not const-qualified */
extern void f1(char* s1);
void g1(void)
{
	f1("string"); /* Non-compliant - parameter s1 is not
	* const-qualified */
}
char* name1(void)
{
	return ("MISRA"); /* Non-compliant - return type is not
	* const-qualified */
}

int main()
{
	return 0;
}