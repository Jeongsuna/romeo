#include <iostream>

extern int y_C112A; // Complaint

int main() {
    y_C112A = 5;
    
    std::cout << "y_C112A: " << y_C112A << std::endl;
    
    return 0;
}