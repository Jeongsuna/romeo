#include <iostream>
#include "header.h"

void C122A_MyClass::someMethod_C122A() { // Non-Complaint
    std::cout << "Hello from class bad.cpp!" << std::endl;
}

int main() {
    C122A_MyClass obj;
    obj.someMethod_C122A();
    
    return 0;
}