#include <cstdint>

int main() {

	while (true)
	{
		/* Compliant by exception 1 */
	}

	do {
		/* Compliant by exception 2 */
	} while (0u == 1u);

	const volatile uint8_t numcy1_cal = 4u;
	/*
	 * Compliant - compiler assuemes numcy1_cal may be changed by
	 * an external method, e,g, automotive calibration tool, even
	 * though the program cannot modify its value
	 */
	if (numcy1_cal == 4u)
	{
	}

	return 0;
}