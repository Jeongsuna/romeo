#include <iostream>

void fn3(void) // Compliant by exception
try
{
    return; // Compliant by exception
}
catch (int32_t)
{
    return; // Compliant by exception
}
catch (...)
{
    return; // Compliant by exception
}

int main()
{
    return 0;
}
