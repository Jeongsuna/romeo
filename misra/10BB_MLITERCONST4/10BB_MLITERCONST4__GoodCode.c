// #include <stdio.h> 추가
// main() 추가
// 10BB_MLITERCONST4__extern.c 추가

#include <stdio.h>

/* Compliant - p is const-qualified; additional qualifiers are permitted */
const volatile char* p = "string";
extern void f2(const char* s2);
void g(void)
{
	f2("string"); /* Compliant */
}
const char* name2(void)
{
	return ("MISRA"); /* Compliant */
}
int main()
{
	return 0;
}