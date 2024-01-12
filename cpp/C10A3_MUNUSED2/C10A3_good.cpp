#include <stdint.h>

int16_t has_dead_code(int16_t para) 
{ 
    int16_t local = 99;
    para = para + local; 
    return para; 
}

int main() {
    int16_t result = has_dead_code(10);
    return 0;
}
