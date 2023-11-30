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
    int16_t k = (3 * i) + (j * j);
    if (f2())
    {
        if (k > 0) // Non-compliant – value of k not used if f2 ( ) returns false
        {
            throw(42);
        }
    }
    return (result);
}

void unusedvalue(int16_t arr[20])
{
    int16_t j;
    j = 2;
    for (int16_t i = 1; i < 10; i++)
    {
        arr[i] = arr[j];
        j++; // Non-compliant – the value assigned to j
    }        // on the final loop is never used.
}

void nounusedvalue(int16_t arr[20])
{
    for (int16_t i = 1; i < 10; i++)
    {
        arr[i] = arr[i + 2];
    }
}

int main()
{
    int16_t arr[20];
    unusedvalue(arr);
    nounusedvalue(arr);
    return 0;
}
