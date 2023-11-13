#include <iostream>

int main() {
    // x 는 정의 되지않아 해당 식별자를 0으로 간주합니다.(비준수)
    #if x < 0
        std::cout << "x is less than 0." << std::endl;
    #endif

    return 0;
}