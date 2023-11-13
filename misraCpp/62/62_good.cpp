#include <cstdint>
#include <climits>

void f() 
{ 
    int32_t s32 = 0; 
    int16_t s16;
    if (s32 >= INT16_MIN && s32 <= INT16_MAX) {
        s16 = (int16_t)s32; // Compliant 
    } else {
        // Handle the error
    }
}

int main() 
{
    f();
    return 0;
}
