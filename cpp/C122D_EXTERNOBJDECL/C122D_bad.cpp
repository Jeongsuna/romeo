#include "header.hpp"
int32_t a2 = 0;        // Non-compliant

void f4() // Non-compliant
{
    a2 = 2;
}
void main() // Compliant by exception
{
    f4();
}
