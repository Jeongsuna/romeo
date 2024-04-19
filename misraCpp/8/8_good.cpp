#include <cstdint>
#include <stdint.h>

int16_t global; // Global variable

void pointless() // Function with external side effects
{ 
    global = 0; 
}

int main() {
    pointless();
    return 0;
}
