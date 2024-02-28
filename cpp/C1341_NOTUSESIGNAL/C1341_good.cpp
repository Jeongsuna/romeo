#include <iostream>
#include <csignal>
#include <cstdint>

void my_handler(int32_t signal) {
    std::cout << "Signal received: " << signal << std::endl;
}

void f1() {
    // signal()을 사용하는 대신 신호 처리를 위한 다른 메커니즘을 고려합니다.
    // 예를 들어 운영 체제나 라이브러리에서 제공하는 기능을 사용합니다. (준수)
}

int main(){
    f1();
    return 0;
}