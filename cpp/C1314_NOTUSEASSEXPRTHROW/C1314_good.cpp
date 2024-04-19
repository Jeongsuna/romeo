#include <iostream>

class E
{
public:
    // 생성자는 예외를 던지지 않음(준수)
    E() {}
};

int main(void)
{
    bool condition = true;
    try
    {
        if (condition)
        {
            // 예외가 발생하지 않는 객체 생성(준수)
            throw E();
        }
    }
    catch (int e)
    {
        std::cout << "Caught exception: " << e << std::endl;
    }
}