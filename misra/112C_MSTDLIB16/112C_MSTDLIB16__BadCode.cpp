#include "stdbool.h"
#include <cstring>
#include <cstdint>
struct S {};;

/*
 * Return value may indicate that 's1' and 's2' are different due to padding.
 */
bool_t f1_2(struct S* s1, struct S* s2)
{
	return (memcmp(s1, s2, sizeof(S)) != 0);      /* Non-compliant */
}

union U
{
	uint32_t range;
	uint32_t height;
};

/*
 * Return value may indicate that 'u1' and 'u2' are the same
 * due to unintentional comparison of 'range' and 'height'.
 */
bool_t f2_2(union U* u1, union U* u2)
{
	return (memcmp(u1, u2, sizeof(union U)) != 0);       /* Non-compliant */
}

const char a[6] = "task";

/*
 * Return value may incorrectly indicate strings are different as the
 * length of 'a' (4) is less than the number of bytes compared (6).
 */
bool_t f3_2(const char b[6])
{
	return (memcmp(a, b, 6) != 0);     /* Non-compliant */
}

int fake_main() {
	f1_2(0, 0);
	f2_2(0, 0);
	f3_2(0);
	return 0;
}