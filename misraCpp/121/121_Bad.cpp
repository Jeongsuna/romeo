#include <iostream>


void fn(void)
{
    int i;
    if (i == 3)
    {
        return; // Non-compliant
    }
    try
    {
        if (i ==  4)
        {
            throw (1); // Compliant by exception
        }
    }
    catch (int32_t)
    {
        throw; // Compliant by exception
    }
    return; // Non-compliant
}

int main(void){return 0;}