// #include <cstdint> 추가
// file1.c와 file2.c 중 하나 주석처리 후 빌드할 것
// file4.c와 file5.c 중 하나 주석처리 후 빌드할 것
// main() 추가

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