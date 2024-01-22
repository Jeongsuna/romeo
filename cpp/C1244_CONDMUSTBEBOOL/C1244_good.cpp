#include <iostream>
#include <stdint.h>

extern int32_t *fn();
extern int32_t fn2();
extern bool fn3();

void example1()
{
    while (int32_t *p = fn()) // Compliant by exception
    {
        // Code
    }
}

void example2()
{
    // The following is a cumbersome but compliant example
    do
    {
        int32_t *p = fn();
        if (NULL == p)
        {
            break;
        }
        // Code...
    } while (true); // Compliant
}

void example3()
{
    while (int32_t length = fn2()) // Compliant by exception
    {
        // Code
    }
}

void example4()
{
    while (bool flag = fn3()) // Compliant
    {
        // Code
    }
}

void example5()
{
    if (int32_t *p = fn())
    {
    } // Compliant by exception

    if (int32_t length = fn2())
    {
    } // Compliant by exception

    if (bool flag = fn3())
    {
    } // Compliant

    uint8_t u8 = 0;
    if (u8 != 0)
    {
    } // Now compliant

    bool bool_1 = true, bool_2 = false;
    if (u8 && (bool_1 <= bool_2) == true)
    {
    } // Now compliant

    for (int32_t x = 10; x != 0; --x)
    {
    } // Now compliant
}

int main()
{
    example1();
    example2();
    example3();
    example4();
    example5();

    return 0;
}
