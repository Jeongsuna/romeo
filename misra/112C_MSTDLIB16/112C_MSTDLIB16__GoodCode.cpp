#include "stdbool.h"
#include <cstring>

bool_t f1(const char* p1, const char* p2)
{
	return (memcmp(p1, p2, sizeof(p1)) != 0); /* Compliant */
}

bool_t f2(const signed int *a, const signed int *b)
{
	return (memcmp(a, b, sizeof(a)) != 0); /* Compliant */
}

bool_t f3(const unsigned int *a, const unsigned int *b)
{
	return (memcmp(a, b, sizeof(a)) != 0); /* Compliant */
}

bool_t f4(const bool_t *a, const bool_t *b)
{
	return (memcmp(a, b, sizeof(a)) != 0); /* Compliant */
}

bool_t f5(const enum Fruit *a, const enum Company *b)
{
	return (memcmp(a, b, sizeof(a)) != 0); /* Compliant */
}

int main() {
	f1(0,0);
	f2(0,0);
	f3(0,0);
	f4(0,0);
	f5(0,0);
	return 0;
}