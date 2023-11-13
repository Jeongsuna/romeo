#include <iostream>
#include <stdexcept>

int main() {
    try {
        throw std::runtime_error("An error occurred.");
    // 예외가 발생하고 캐치되지만, terminate() 함수가 암시적으로 호출됩니다
    } catch (const std::exception& e) {
        std::cerr << "Caught an exception: " << e.what() << std::endl;
    }
}
