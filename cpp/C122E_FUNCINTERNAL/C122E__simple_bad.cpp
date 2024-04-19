#include <iostream>

void fun_122E_1();

static void fun_122E_1() {  // Non-compliant
    std::cout << "Hello, World!" << std::endl;
}

namespace MyNamespace {
    static void fun_122E_2();

    void fun_122E_2(){   // Non-compliant
        std::cout << "Hello, World! 2" << std::endl;
    }
}

int main() {
    return 0;
}
