#include <iostream>
#include <stdint.h>

class A {};
class B {};

void f(int32_t i) throw() {
    try {
        if (i > 10) {
            // Compliant
            throw A();
        } else {
            // Non-compliant
            throw B();
        }
    } catch (A const &) {
    }
}

int main() {
    return 0;
}