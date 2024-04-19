#include <iostream>

int f(int a, int b) {
    int result = a + b;
    return result;
}

int main() {
    int a = 1, b = 2, c = 3;
    f(a, f(b, c)); // Compliant
    return 0;
}
