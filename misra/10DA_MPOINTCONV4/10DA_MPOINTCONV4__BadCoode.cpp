#include <cstdint>
#include <iostream>
#include "stdbool.h"
 #

int fake_main() {
	uint8_t* PORTA = (uint8_t*)0x0002;   /* Non-compliant */

	uint16_t* p;

	int32_t addr = (int32_t)&p;     /* Non-compliant */
	uint8_t* q = (uint8_t*)addr;   /* Non-compliant */
	bool_t b = (bool_t)p;           /* Non-compliant */

	//enum etag { A, B }e;
	//e = static_cast<etag>(&p);  /* Non-compliant */
	
	return 0;
}