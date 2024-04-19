#include <iostream>

int main() {
    char code[7];

    code[5] = '\109'; // Non-compliant - implementation-defined, two character constant 
    code[6] = '\100'; // Non-compliant - set to 64

    for(int i=1; i<7; i++) {
        std::cout << "code[" << i << "] = " << code[i] << std::endl;
    }

    return 0;
}
