#include "stdbool.h"
/* Compliant */
int main3() {
	bool_t x = true;
	bool_t y = true;
	bool_t z = true;

	if (x == false) {
		y = x;
	}
	else {
		y = z;
	}
	return 0;
}