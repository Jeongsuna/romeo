#include "stdbool.h"
#include <cstdint>
#define bool_t bool

bool_t flag = false;

int main() {
	for (int16_t i = 0; (i < 5) && !flag; i++)
	{
		if (i == 7)
		{
			flag = true;    /* Compliant - allows early termination
							 * of loop */
		}

	}
	return 0;
}