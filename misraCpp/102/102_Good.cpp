#include <iostream>

void process_data() {
    // process_data 함수의 내용을 구현해주세요.
}

void service_watchdog() {
    // service_watchdog 함수의 내용을 구현해주세요.
}
int main() {
    const int N_ELEMENTS = 10;
    int buffer[N_ELEMENTS];
    bool new_data_available = true;

    // 반복문 구문 뒤에는 복합 문으로 작성해야 합니다.(준수)
    for (int i = 0; i < N_ELEMENTS; ++i)
    {
        buffer[i] = 0;
    }
    while (new_data_available)
    {
        process_data();
        service_watchdog();
    }
    return 0;
}