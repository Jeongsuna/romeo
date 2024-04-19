#include <iostream>

enum { COLOUR_0, COLOUR_1, COLOUR_2, COLOUR_COUNT } colour;

int main() {
    colour = COLOUR_1;

    if ( COLOUR_0 == colour ) { // Compliant 
        std::cout << "Colour is COLOUR_0" << std::endl;
    }

    // if ( ( COLOUR_0 + COLOUR_1 ) == colour ) { // Non-compliant 
    //     std::cout << "Non-compliant condition" << std::endl;
    // }

    if ( colour < COLOUR_COUNT ) { // Compliant
        std::cout << "Colour is within range" << std::endl;
    }

    return 0;
}
