#include <iostream>
#include <stdexcept>

int main() {
    try {
        throw std::runtime_error("An error occurred.");
    } catch (const std::exception& e) {
        std::cerr << "Caught an exception: " << e.what() << std::endl;
    // catch (...){} 블록 을 추가하여 모든 예외에 대한 처리를 제공하고, terminate() 함수의 호출을 방지합니다
    } catch (...) {
        std::cerr << "An unhandled exception occurred." << std::endl;
    }
}