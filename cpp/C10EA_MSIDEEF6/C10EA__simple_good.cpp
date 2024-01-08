#include <stdint.h>

int main() {
    int32_t i;
    int32_t j;
    volatile int32_t k;
    
    // compliant: volatile은 예외
    j = sizeof(k);
    
    return 0;
}