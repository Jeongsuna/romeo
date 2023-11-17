#include <iostream>

int main() {
    int x = 0, y = 0, z = 0;
    bool ishigh = false;
    int c1 = 10, c2 = 20, c3 = 30;

    if (x == 0 && ishigh) { // Non-compliant 
        std::cout << "Condition 1: x is 0 and ishigh is true" << std::endl;
    }

    if (x || y && z) { // Non-compliant 
        std::cout << "Condition 2: x is true or both y and z are true" << std::endl;
    }

    if (x && !y) { // Non-compliant 
        std::cout << "Condition 3: x is true and y is not true" << std::endl;
    }

    if ((x > c1) && (y > c2) || (z > c3)) { // Non-compliant 
        std::cout << "Condition 4: x is greater than c1 and y is greater than c2 or z is greater than c3" << std::endl;
    }

    return 0;
}
