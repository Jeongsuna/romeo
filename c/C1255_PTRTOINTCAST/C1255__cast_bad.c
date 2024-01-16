#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main() {
    uint16_t* p;

    int32_t addr = (int32_t)&p;     /* Non-compliant */
    bool_t b = (bool_t)p;           /* Non-compliant */

    enum etag { A, B } e = (enum etag) p;  /* Non-compliant */
}