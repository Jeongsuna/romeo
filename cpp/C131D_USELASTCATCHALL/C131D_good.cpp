#include <cstdint>

void f2()
{
    try
    {
        // ...
    }
    catch ( int32_t i )
    {
        // Handle int exceptions
    }
    catch( ... ) // cath_all 핸들러가 마지막에 위치하고있습니다. (준수)
    {
        // Handle all exception types
    }
}

int main()
{
    return 0;
}