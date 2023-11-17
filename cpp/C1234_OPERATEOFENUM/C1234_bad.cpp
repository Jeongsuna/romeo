#include <iostream>

enum { COLOUR_0, COLOUR_1, COLOUR_2, COLOUR_COUNT } colour;

int main() {
    colour = COLOUR_0;

    if ( ( COLOUR_0 + COLOUR_1 ) == colour ) { // Non-compliant 
        std::cout << "Non-compliant condition" << std::endl;
    }
    
    if ( !COLOUR_1 ) { // Non-compliant 
        std::cout << "Non-compliant condition" << std::endl;
    }

    if ( COLOUR_2 >> COLOUR_1 ) { // Non-compliant 
        std::cout << "Non-compliant condition" << std::endl;
    }


    return 0;
}
