#include <cstdint>
#include "stdbool.h"

extern void f(signed int) {};
void f(int); /* Compliant - Exception */

extern void f1(int16_t x) { };
extern void f2(int16_t y) { };
void f(bool_t b)
{
	void (*fp1) (int16_t z) = b ? f1 : f2;
}
int main() {
	f(true);
	return 0;
}