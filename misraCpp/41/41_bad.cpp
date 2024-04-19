#include <cstdint>

        int32_t array1[10]; // Compliant 
extern int32_t array2[]; // Non-compliant - The size of the array is unknown
        int32_t array3[] = {0, 10, 15}; // Compliant - The size of the array is determined by the number of elements in the initializer list
extern int32_t array4[42]; // Compliant - The size of the array is specified
