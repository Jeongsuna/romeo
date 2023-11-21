#include <iostream>

int main() {
    int16_t int16_b = 1;
    int32_t int32_c = 2;
    int32_t int32_d = 3;
    bool bool_b = true;

    // Compliant
    int32_t int32_a = (int16_b != 0) ? int32_c : int32_d; 
    std::cout << "Compliant result (inequality): " << int32_a << std::endl;

    // Compliant
    int32_a = bool_b ? int32_c : int32_d; 
    std::cout << "Compliant result (bool): " << int32_a << std::endl;

    // Compliant
    int32_a = (int16_b < 5) ? int32_c : int32_d; 
    std::cout << "Compliant result (comparison): " << int32_a << std::endl;

    return 0;
}
