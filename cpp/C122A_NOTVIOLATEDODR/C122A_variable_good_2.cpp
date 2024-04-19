#include <iostream>

int y_C112A;

void someFunction2_C122A() {
    y_C112A = 10;
}

int main() {
    someFunction2_C122A();
    
    std::cout << "y_C112A: " << y_C112A << std::endl;
    
    return 0;
}