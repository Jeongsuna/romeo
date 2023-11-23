#include <iostream>

int main() {
    char code[7];

    code[1] = 109; // Compliant - decimal 109 
    code[2] = 100; // Compliant - decimal 100 
    code[3] = 052; // Non-compliant - equivalent to decimal 42 
    code[4] = 071; // Non-compliant - equivalent to decimal 57
    code[5] = '\109'; // Non-compliant - implementation-defined, two character constant 
    code[6] = '\100'; // Non-compliant - set to 64

    for(int i=1; i<7; i++) {
        std::cout << "code[" << i << "] = " << code[i] << std::endl;
    }

    return 0;
}
