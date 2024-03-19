#include <cstdint>

class C
{
public:
    C ( int32_t a ) // Non-compliant
    {
    }
};

int main()
{
    C c(10);

    return 0;
}
