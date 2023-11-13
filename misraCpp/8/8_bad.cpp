#include <cstdint>
#include <stdint.h>

void pointless() // Non-compliant – no external side effects 
{ 
    int16_t local;
    local = 0; 
}

int main() {
    pointless();
    return 0;
}
