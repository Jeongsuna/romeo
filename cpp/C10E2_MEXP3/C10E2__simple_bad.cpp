#include <iostream>

int f(int a, int b) {
    int result = a + b;
    return result
}

int main() {
    int a = 1, b = 2, c = 3;
    f((a, b), c); // Non-compliant - how many parameters?
    return 0;
}
