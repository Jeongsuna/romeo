#include <stdint.h>

extern int16_t array[]; // Non-compliant - The size of the array is unknown
extern int32_t array2[]; // Non-compliant - The size of the array is unknown

int main() {
        return 0;
}