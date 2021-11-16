#include <cstdint>
#include <arm_neon.h>
#define PI 3.141592

/* Compliant */
int32_t x[3] = { 0, 1, 2 };
/* Compliant - designated initializers for sparse matrix */
float32_t z[50] = { z[1] = 1.0f, z[25] = 2.0f };
float32_t arr[3][2] =
{
{ 0.0f, 0.0f },
{ PI / 4.0f, -PI / 4.0f },
{ 0 } /* initializes all elements of array subobject arr[ 2 ] */
};
char h[10] = "Hello"; /* Compliant by Exception 3 */

int main(){
	return 0;
}