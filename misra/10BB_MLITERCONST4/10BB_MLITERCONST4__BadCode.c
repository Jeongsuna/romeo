// #include <stdio.h> �߰�
// main() �߰�
// 10BB_MLITERCONST4__extern.c �߰�
// "0123456789"[0] = '*';�� ���������� �ּ�ó����

#include <stdio.h>

// "0123456789"[0] = '*'; /* Non-compliant */
char* s = "string"; /* Non-compliant - s is not const-qualified */
char strs[] = "Hello"; /* Non-compliant - s is not const-qualified */
extern void f1(char* s1);
void g1(void)
{
	f1("string"); /* Non-compliant - parameter s1 is not const-qualified */
}
char* name1(void)
{
	return ("MISRA"); /* Non-compliant - return type is not const-qualified */
}

int main()
{
	return 0;
}