#include "stdbool.h"
#include <cstdint>

bool_t flag = false;

int main() {
	for (int16_t i = 0; (i < 5) && !flag; i++)
	{
		if (i == 7)
		{
			flag = true;    /* Compliant - allows early termination
							 * of loop */
		}

		i = i + 3;        /* Non-compliant - altering the loop
						   * couner */
	}
	return 0;
}