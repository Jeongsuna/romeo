#include <cstdint>
struct stag2
{
    uint16_t a;
    uint16_t b;
};
struct stag2 a1 = { 0, 0 }; /* Compliant - compatible with above */

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

int fake_main()
{
    return 0;
}