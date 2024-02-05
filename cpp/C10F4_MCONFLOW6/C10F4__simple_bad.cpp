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

    // for 반복문 구문 뒤에 (;) 있습니다.(비준수)
    for (int i = 0; i < N_ELEMENTS; ++i)
        ;
    {
        buffer[i] = 0;
    }

    // while 반복문 구문 뒤에 중괄호 없이 정의 하고 있습니다.(비준수)
    while (data_available)
        process_data();
        service_watchdog();

    // swtich 선택문에서 복합문을 사용하지 않고 있습니다. (비준수)
    int i = 1;
    switch (i)
    case 1:
        std::cout << "One";

    // do ... while 반복문 구문 뒤에 중괄호 없이 정의하고 있습니다. (비준수)
    do
        std::cout << i++;
    while (i < 10);

    return 0;
}