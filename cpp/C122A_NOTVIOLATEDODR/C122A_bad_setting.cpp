#include <iostream>
#include "header.h"

int x_C112A;

void C122A_MyClass::someMethod_C122A() {
    std::cout << "Hello from bad setting.cpp!" << std::endl;
}

void someFunction_C122A() {
    std::cout << "Hello from bad setting.cpp!" << std::endl;
}

int main() {
    x_C112A = 5;
    
    std::cout << "x_C112A: " << x_C112A << std::endl;
    
    return 0;
}