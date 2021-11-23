#include <cstdint>
uint32_t zext2(uint16_t s)
{
    union
    {
        int32_t ul;
        int16_t us;
    } tmp;

    tmp.us = s;
    return tmp.ul;      /* unspecified values */
}
int fake_main() {
    zext2(1);
    return 0;
}