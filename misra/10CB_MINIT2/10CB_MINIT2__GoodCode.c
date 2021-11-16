// #include <arm64_neon.h> 추가
// int16_t y[ 3 ][ 2 ] 여러번 정의되므로 한 번만 정의될 수 있게 주석처리 
// float32_t a[3][2] 여러번 정의되므로 한 번만 정의될 수 있게 주석처리

#include <arm64_neon.h>

//int16_t y[ 3 ][ 2 ] = { { 1, 2 }, { 0 }, { 5, 6 } }; /* Compliant */
int16_t y[3][2] = { { 1, 2 }, { 0, 0 }, { 5, 6 } }; /* Compliant */
int16_t z1[2][2] = { { 0 },[1][1] = 1 }; /* Compliant */
int16_t z2[2][2] = { { 0 },[1][1] = 1,[1][0] = 0 }; /* Compliant */
int16_t z4[2][2] = { [0] [1] = 0, { 0, 1 } }; /* Compliant */
//float32_t a[3][2] = { 0 }; /* Compliant */
float32_t a[3][2] = { { 0 }, { 0 }, { 0 } }; /* Compliant */
//float32_t a[3][2] = { { 0.0f, 0.0f }, { 0.0f, 0.0f }, { 0.0f, 0.0f } }; /* Compliant */
union u1 {
	int16_t i;
	float32_t f;
} u = { 0 }; /* Compliant */
struct s1 {
	uint16_t len;
	char
		buf[8];
} s[3] = {
{ 5u, { 'a', 'b', 'c', 'd', 'e', '\0', '\0', '\0' } },
{ 2u, { 0 } },
{.len = 0u } /* Compliant - buf initialized implicitly */
}; /* Compliant - s[] fully initialized */

int main()
{

}