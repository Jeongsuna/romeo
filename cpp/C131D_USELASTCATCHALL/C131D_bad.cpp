#include <cstdint>

void f1()
{
    try
    {
        // ...
    }
    // cath_all 핸들러는 마지막에 위치해야합니다. (비준수)
    catch( ... )
    {
        // Handle all exception types
    }
    catch ( int32_t i )
    {
        // Handle int exceptions
    }
}

int main()
{
    return 0;
}