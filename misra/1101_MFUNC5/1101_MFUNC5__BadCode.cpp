#include <cstdint>
/*
 * Intent is that function does not access outside the range
 * array[ 0 ] .. array[ 3 ]
 */
void fn1_2(int32_t array1[4]) {};

/* Intent is that function handles arrays of any size */
void fn2_2(int32_t array2[]) {};

void fnc(int32_t* ptr)
{
	int32_t arr3[3] = { 1, 2, 3 };
	int32_t arr4[4] = { 0, 1, 2, 3 };

	/* Compliant - size of array matches the prototype */
	fn1_2(arr4);

	/* Non-compliant - size of array does not match prototype */
	fn1_2(arr3);

	/* Compliant - only if ptr points to at least 4 elements */
	fn1_2(ptr);

	/* Compliant */
	fn2_2(arr4);

	/* Compliant */
	fn2_2(ptr);
}

int fake_main() {
	int32_t arr5[4] = { 0, 1, 2, 3 };
	fnc(arr5);
	return 0;
}