#include <cstdint>
/*
 * Intent is that function does not access outside the range
 * array[ 0 ] .. array[ 3 ]
 */
void fn1(int32_t array1[4]) {};

/* Intent is that function handles arrays of any size */
void fn2(int32_t array2[]) {};

void fn(int32_t* ptr)
{
	int32_t arr3[3] = { 1, 2, 3 };
	int32_t arr4[4] = { 0, 1, 2, 3 };

	/* Compliant - size of array matches the prototype */
	fn1(arr4);

	/* Compliant - only if ptr points to at least 4 elements */
	fn1(ptr);

	/* Compliant */
	fn2(arr4);

	/* Compliant */
	fn2(ptr);
}
int main() {
	int32_t arr5[4] = { 0, 1, 2, 3 };
	fn(arr5);
	return 0;
}