#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main() {
    uint8_t* PORTA = 0;  /* Compliant */

    int32_t addr1;
    int32_t* p1 = &addr1;  /* Compliant */

    uint8_t addr2;
    uint8_t* p2 = &addr2;  /* Compliant */
}