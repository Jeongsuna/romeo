#include <chrono>
#include <iostream>

void f()
// ctime,time.h 시간 처리 함수 대신에 chrono 라이브러리를 사용하여 작업합니다.
{
    auto currentTime = std::chrono::system_clock::now();
    std::chrono::time_point<std::chrono::system_clock> start;
    start = std::chrono::system_clock::now();

    // Do some work...

    auto end = std::chrono::system_clock::now();
    std::chrono::duration<double> elapsed_seconds = end - start;
    std::cout << "Elapsed time: " << elapsed_seconds.count() << "s\n";
}

int main()
{
    f();
    return 0;
}