#include <iostream>

int main() {
    char code[7];

    code[1] = 109; // Compliant - decimal 109 
    code[2] = 100; // Compliant - decimal 100 
    code[3] = 42; // Compliant - decimal 42 
    code[4] = 57; // Compliant - decimal 57
    code[5] = 'm'; // Compliant - character constant 
    code[6] = '@'; // Compliant - character constant

    for(int i=1; i<7; i++) {
        std::cout << "code[" << i << "] = " << code[i] << std::endl;
    }

    return 0;
}
