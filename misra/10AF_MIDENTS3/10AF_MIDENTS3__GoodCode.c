// #include <arm64_neon.h> �߰�
// main() �߰�
// 10AF_MIDENTS3_extern.c �߰�
// �ַ���� ARM64�� ���� �� ����

#include <arm64_neon.h>


void fn1_2 ( void )
{
	int16_t i; /* Declare an object ""i"" */
	{
		int16_t j; /* Declare an object ""j"" */
		i = 3;
	}
}
struct astruct
{
	int16_t m;
};
extern void g(struct astruct* p);
int16_t xyz2 = 0; /* Declare an object ""xyz""*/
void fn2_2(struct astruct x)
{
	g(&x);
}
int fake_main()
{
	return 0;
}