#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main() {
    int32_t i = 3;
	uint8_t* PORTA = (uint8_t*)0x0002;   /* Non-compliant */
	uint8_t* q = (uint8_t*) i;   /* Non-compliant */
}