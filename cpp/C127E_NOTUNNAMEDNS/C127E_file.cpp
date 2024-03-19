#include <iostream>
#include "C127E_bad.hpp"
#include "C127E_good.hpp"

int main() {
    bad = 10;
    MyNamespace::good = 20;
    return 0;
}

// compliant
namespace
{ 
    extern int file; 
}