#include <iostream>

void process_data()
{
}

void service_watchdog()
{
}

int main()
{
    bool data_available = true;
    const int N_ELEMENTS = 10;
    int buffer[N_ELEMENTS];

    // 반복문 구문 뒤에 (;) 있습니다.(비준수)
    for (int i = 0; i < N_ELEMENTS; ++i)
        ;
    {
        buffer[i] = 0;
    }
    //  반복문 구문 뒤에 중괄호 없이 정의 하고 있습니다.(비준수)
    while (data_available)
        process_data();
    service_watchdog();

    return 0;
}