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
            // Now Compliant
            throw B();
        }
    } catch (A const &) {
    } catch (B const &) {
    // Added handler for B
    }
}

int main() {
    return 0;
}