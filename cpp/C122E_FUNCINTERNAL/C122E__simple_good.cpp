#include <iostream>

static void fun_122E_3();

static void fun_122E_3() {  // Now-compliant
    std::cout << "Hello, World!" << std::endl;
}

namespace MyNamespace {
    static void fun_122E_4();

    static void fun_122E_4(){   // Now-compliant
        std::cout << "Hello, World! 2" << std::endl;
    }
}

int main() {
    return 0;
}
