#include <cstdint>

int main()
{
    uint16_t x;
    uint16_t* const cpi = &x;        /* const pointer */
    uint16_t* const* pcpi;           /* pointer to const pointer */
    uint16_t** ppi;
    const uint16_t* pci;              /* pointer to const */
    volatile uint16_t* pvi = 0;           /* pointer to volatile */
    uint16_t* pi;

    pi = cpi;                         /* Compliant - no conversion
                                            no cast required */
    return 0;
}