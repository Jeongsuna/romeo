#include <iostream>

void fun_122E_1();

static void fun_122E_1() {  // Now-compliant
    std::cout << "Hello, World!" << std::endl;
}

namespace MyNamespace {
    static void fun_122E_2();

    void fun_122E_2(){   // Now-compliant
        std::cout << "Hello, World! 2" << std::endl;
    }
}

int main() {
    fun_1();
    return 0;
}
