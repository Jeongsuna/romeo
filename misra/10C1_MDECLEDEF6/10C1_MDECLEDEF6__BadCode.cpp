// #include <cstdint> �߰�
// file1.c�� file2.c �� �ϳ� �ּ�ó�� �� ������ ��
// file4.c�� file5.c �� �ϳ� �ּ�ó�� �� ������ ��
// main() �߰�

#include <cstdint>
/* file1.c */
int16_t i = 10;
/* file2.c */
//int16_t i = 20; /* Non-compliant - two definitions of i */

/* file4.c */
int16_t k; /* Tentative definition - becomes external */
/* file5.c */
//int16_t k = 0; /* Non-compliant - External definition*/

int main()
{
	return 0;
}