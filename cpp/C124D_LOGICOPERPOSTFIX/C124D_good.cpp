#include <iostream>

bool is_odd(int num) {
    return num % 2 != 0;
}

int main() {
    int x = 0, y = 0, z = 0;
    bool ishigh = false;
    int c1 = 10, c2 = 20, c3 = 30;

    if ((x == 0) && ishigh) { // Compliant 
        std::cout << "Condition 1: x is 0 and ishigh is true" << std::endl;
    }

    if (x || y || z) { // Compliant by exception, if x, y and z bool 
        std::cout << "Condition 2: x, y or z is true" << std::endl;
    }

    if (x || (y && z)) { // Compliant 
        std::cout << "Condition 3: x is true or both y and z are true" << std::endl;
    }

    if (x && (!y)) { // Compliant 
        std::cout << "Condition 4: x is true and y is not true" << std::endl;
    }

    if (is_odd(y) && x) { // Compliant
        std::cout << "Condition 5: y is odd and x is true" << std::endl;
    }

    if ((x > c1) && (y > c2) && (z > c3)) { // Compliant - exception 
        std::cout << "Condition 6: x is greater than c1, y is greater than c2 and z is greater than c3" << std::endl;
    }

    if ((x > c1) && ((y > c2) || (z > c3))) { // Compliant
        std::cout << "Condition 7: x is greater than c1 and either y is greater than c2 or z is greater than c3" << std::endl;
    }

    return 0;
}
