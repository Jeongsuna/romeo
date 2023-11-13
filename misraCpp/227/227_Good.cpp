#include <iostream>
#include <cstdlib>
#include <stdexcept>

void f1(const char* str)
{
    try {
        // std::stoi를 사용하여 예외 처리를 통해 오류를 처리합니다.
        int32_t i = std::stoi(str);

        // 정상적인 작업 수행
    }
    catch (const std::invalid_argument& e) {
        // 문자열이 정수로 변환할 수 없는 경우에 대한 처리
    }
    catch (const std::out_of_range& e) {
        // 정수 범위를 벗어나는 경우에 대한 처리
    }
}

int main(void){return 0;}