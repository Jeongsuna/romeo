#include <stdint.h>

int main() {
    /* Non-compliant - int used to define an object */
    int x = 0;

    /* Non-compliant - no sign or size specified */
    typedef int speed_t;

    return 0;
}