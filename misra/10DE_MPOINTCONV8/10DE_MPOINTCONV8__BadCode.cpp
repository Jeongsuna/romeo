#include <cstdint>

int fake_main()
{
	uint16_t x;
	uint16_t* const cpi = &x;        /* const pointer */
	uint16_t* const* pcpi = 0;           /* pointer to const pointer */
	uint16_t** ppi;
	const uint16_t* pci = 0;              /* pointer to const */
	volatile uint16_t* pvi = 0;           /* pointer to volatile */
	uint16_t* pi;

	pi = (uint16_t*)pci;             /* Non-compliant */
	pi = (uint16_t*)pvi;             /* Non-compliant */
	ppi = (uint16_t**)pcpi;           /* Non-compliant */

	return 0;
}