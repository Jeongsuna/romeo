// #include <cstdint> �߰�
// j�� �� �� ������ �� �����Ƿ�, 'int16_t j;'�� 'int16_t j = 1;' �� �ϳ� �ּ�ó��
// main() �߰�

#include <cstdint>
/* file3.c */
int16_t j; /* Tentative definition */
//int16_t j = 1; /* Compliant - external definition */

int fake_main()
{
	return 0;
}