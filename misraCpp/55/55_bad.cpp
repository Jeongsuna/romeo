#include <iostream>
#include <cstddef>

void f1(int32_t val) {
    std::cout << "f1: " << val << std::endl;
}

void f2(int32_t* val) {
    if (val == NULL) {
        std::cout << "f2: NULL" << std::endl;
    } else {
        std::cout << "f2: " << *val << std::endl;
    }
}

void f3() {
    f1(NULL); // Not-compliant, NULL used as an integer
    f2(NULL); // Compliant
}

int main() {
    int32_t val = 10;
    f1(val);
    f2(&val);
    f3();
    return 0;
}
