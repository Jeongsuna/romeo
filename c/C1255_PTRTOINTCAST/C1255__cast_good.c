#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main() {
    uint8_t addr2;
    uint8_t* p2 = &addr2;  /* Compliant */

    bool_t addr3;
    bool_t* p3 = &addr3;  /* Compliant */

    enum etag {
    	A,
    	B
    } e;
    enum etag* p4 = &e; /* Compliant */
}