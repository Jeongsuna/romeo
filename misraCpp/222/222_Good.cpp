#include <iostream>
#include <chrono>

void f()
{
    // std::chrono 라이브러리를 사용하여 시간 처리 기능을 사용합니다.
    auto start = std::chrono::high_resolution_clock::now();
    
    // 시간을 측정하는 코드 작성

    auto end = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::microseconds>(end - start);

    std::cout << "Time taken by function: " << duration.count() << " microseconds" << std::endl;
}

int main(void){return 0;}