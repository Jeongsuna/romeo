#include <stdint.h>

int16_t unusedtype() 
{ 
    typedef int16_t local_Type; // Non-compliant
    return 67; 
}

int main() 
{
    int16_t result = unusedtype();
    return 0;
}
