#include <cstdint>

        int32_t array1[10]; // Compliant 
extern int32_t array2[10]; // Now compliant, size is explicitly stated
        int32_t array3[] = {0, 10, 15}; // Compliant 
extern int32_t array4[42]; // Compliant
