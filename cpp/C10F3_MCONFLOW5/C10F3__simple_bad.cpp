#include <iostream>

void fn1(void) // Non-compliant
{
    if (true)
    {
        return; // Return 1
    }
    try
    {
        if (true)
        {
            throw(1); // Compliant by exception
        }
    }
    catch (int32_t)
    {
        throw; // Compliant by exception
    }
    return; // Return 2
}

void fn2(void) // Non-compliant
{
    try
    {
        return; // Return 1
    }
    catch (...)
    {
        return; // Return 2
    }
}

int main()
{
    return 0;
}
