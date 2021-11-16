#include <cstdint>
struct stag
{
    uint16_t a;
    uint16_t b;
};
struct stag a1 = { 0, 0 }; /* Compliant - compatible with above */

struct deer
{
    uint16_t a;
    uint16_t b;
}; /* Compliant */

typedef struct coord
{
    uint16_t x;
    uint16_t y;
} coord; /* Compliant by Exception */

struct elk
{
    uint16_t x;
}; /* Compliant */

int main()
{
    return 0;
}