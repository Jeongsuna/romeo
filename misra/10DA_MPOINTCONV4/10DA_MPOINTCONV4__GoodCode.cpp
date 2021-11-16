#include <cstdint>
#include "stdbool.h"

int main() {
	uint8_t* PORTA = 0;  /* Compliant */

	int32_t addr1;
	int32_t* p1 = &addr1;  /* Compliant */

	uint8_t addr2;
	uint8_t* p2 = &addr2;  /* Compliant */

	bool_t addr3;
	bool_t* p3 = &addr3;  /* Compliant */

	enum etag {
		A,
		B
	}e;
	enum etag* p4 = &e; /* Compliant */

	return 0;
}