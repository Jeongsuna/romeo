#include <iostream>
#include "header.h"

void someFunction_C122A() { // Non-Compliant
    std::cout << "Hello from bad1.cpp!" << std::endl;
}

int main() {
    someFunction_C122A();
    
    return 0;
}