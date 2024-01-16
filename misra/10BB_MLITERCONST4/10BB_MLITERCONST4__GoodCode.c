// #include <stdio.h> �߰�
// main() �߰�
// 10BB_MLITERCONST4__extern.c �߰�

#include <stdio.h>

/* Compliant - p is const-qualified; additional qualifiers are permitted */
const volatile char* q = "string"; /* Compliant */
const char strs[] = "Hello"; /* Compliant */
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