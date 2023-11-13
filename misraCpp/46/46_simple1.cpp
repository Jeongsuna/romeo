#include "header.hpp"
int32_t a1 = 0;        // Compliant
int32_t a2 = 0;        // Non-compliant
static int32_t a3 = 0; // Compliant
namespace
{
    int32_t a4 = 0; // Compliant
    void f1()       // Compliant
    {
    }
}
static void f2() // Compliant
{
}
void f3() // Compliant
{
    a1 = 1;
    a2 = 1;
    a3 = 1;
    a4 = 1;
}
void f4() // Non-compliant
{
    a1 = 2;
    a2 = 2;
    a3 = 2;
    a4 = 2;
}
void main() // Compliant by exception
{
    f1();
    f2();
    f3();
    f4();
}
