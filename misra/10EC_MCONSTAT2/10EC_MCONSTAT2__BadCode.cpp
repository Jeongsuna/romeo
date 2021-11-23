#include "stdbool.h"
#include <cstdint>
#define bool_t2 bool

bool_t2 flag2 = false;

int fake_main() {
	for (int16_t i = 0; (i < 5) && !flag2; i++)
	{
		if (i == 7)
		{
			flag2 = true;    /* Compliant - allows early termination
							 * of loop */
		}

		i = i + 3;        /* Non-compliant - altering the loop
						   * couner */
	}
	return 0;
}