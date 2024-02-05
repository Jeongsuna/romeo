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

    for (int i = 0; i < N_ELEMENTS; ++i)
    {
        buffer[i] = 0;
    }

    while (data_available)
    {
        process_data();
        service_watchdog();
    }
    
    int i = 1;
    switch (i)
    {
        case 1:
            std::cout << "One";
            break;
        default:
            break;
    }

    do
    {
        std::cout << i++;
    }
    while (i < 10);

    return 0;
}
