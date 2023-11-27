#include <iostream>
#include <stdint.h>

void a ( ) 
{ 
    uint8_t u8a = 0;
    uint8_t u8b = 0;
    u8a = u8a + 0x80;
    u8b = u8b + 0200;
}

void b ( ) 
{ 
    uint16_t u16a = 0;
    uint16_t u16b = 0;
    u16a = u16a + 0x8000;
    u16b = u16b + 020000;
}

void c ( ) 
{ 
    uint32_t u32a = 0;
    uint32_t u32b = 0;
    u32a = u32a + 0x80000000;
    u32b = u32b + 020000000000;
}

void d ( ) 
{ 
    uint64_t u64a = 0;
    uint64_t u64b = 0;
    u64a = u64a + 0x8000000000000000;
    u64b = u64b + 02000000000000000000000;
}

int main() {
    return 0;
}
