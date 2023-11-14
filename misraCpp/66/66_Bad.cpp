#include <iostream>

uint8_t port = 0x5aU; 
uint8_t result_8; 
uint16_t result_16; 
uint16_t mode;

int main(void) {
    result_8 = ( ~port ) >> 4; // Non-compliant 
    return 0;
}

