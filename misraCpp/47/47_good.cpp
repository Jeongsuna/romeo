#include <iostream>

static void f1();

static void f1() {
    std::cout << "Hello, World!" << std::endl;
}

int main() {
    f1();
    return 0;
}
