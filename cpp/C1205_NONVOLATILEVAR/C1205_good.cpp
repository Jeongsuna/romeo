#include <cstdint>
#include <stdint.h>

bool f2() 
{
    // You can replace this with your actual implementation
    return true;
}

int16_t critical(int16_t i, int16_t j) 
{ 
    int16_t result = 0; 
    if (f2()) 
    { 
        int16_t k = (3 * i) + (j * j);
        if (k > 0)
        { 
            throw(42); 
        } 
    }
    return (result); 
}


void nounusedvalue(int16_t arr[20])
{
    for (int16_t i = 1; i < 10; i++)
    {
        arr[i] = arr[i + 2];
    }
}

int main() {
    int16_t arr[20];
    unusedvalue(arr);
    nounusedvalue(arr);
    return 0;
}
