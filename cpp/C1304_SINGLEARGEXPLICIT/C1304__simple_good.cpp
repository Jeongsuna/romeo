#include <cstdint>

class D
{
public:
    explicit D ( int32_t a ) // Compliant
    {
    }
};

int main()
{
    D d(20);

    return 0;
}
