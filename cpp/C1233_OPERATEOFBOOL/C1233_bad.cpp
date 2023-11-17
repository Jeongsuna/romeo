#include <cstdint>

int main() {
    bool b1 = true; 
    bool b2 = false; 
    int8_t s8a;

    // Non-compliant 
    if ( b1 & b2 ) {}  
    if ( b1 < b2 ) {}
    if ( ~b1 ) {}
    if ( b1 ^ b2 ) {} 
    b1 + b2;
    b1 - b2;
    b1 * b2;
    b1 / b2;
    b1 % b2;
    b1 >> b2;
    b1 << b2;
    b1 > b2;
    b1 < b2;
    b1 += b2;
    b1 += b2;
    b1 *= b2;
    b1 /= b2;
    b1 %= b2;
    b1 <<= b2;
    b1 >>= b2;
    b1 &= b2;
    b1 ^= b2;
    b1 |= b2;

    return 0;
}
