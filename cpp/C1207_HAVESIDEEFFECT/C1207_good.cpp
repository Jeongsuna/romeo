#include <cstdint>
#include <stdint.h>

int16_t global1; // Global variable
int16_t global2;
static int staticvar;

void pointless() // Function with external side effects
{ 
    global1 = 0; 
    staticvar = 5;
}

int main() {
    pointless();
    return 0;
}
