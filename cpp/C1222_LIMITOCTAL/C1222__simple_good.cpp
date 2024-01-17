#include <iostream>

int main() {
    char code[7];

    code[5] = 'm'; // Compliant - character constant 
    code[6] = '@'; // Compliant - character constant

    for(int i=1; i<7; i++) {
        std::cout << "code[" << i << "] = " << code[i] << std::endl;
    }

    return 0;
}
