#include <iostream>

void Perform_Critical_Safety_Function(int X) {
    // Critical safety function implementation
    std::cout << "Performing critical safety function with X = " << X << std::endl;
}

int main() {
    int X = 10;
    /* some comment, end comment marker accidentally omitted
    Perform_Critical_Safety_Function(X); 
    /* this "comment" is Non-compliant */

    return 0;
}
