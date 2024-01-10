#include <stdint.h>

int main() {
    /* Compliant - int used to define specific-length type */
    typedef int SINT_16;

    /* Compliant - further abstraction does not need specific length */
    typedef int16_t torque_t;

    return 0;
}