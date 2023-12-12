#include <stdint.h>

extern int16_t arr[5]; // Compliant 
int16_t arr2[2]; // Compliant 

int main() {
        int32_t array1[10]; // Compliant 
        int32_t array3[] = {0, 10, 15}; // Compliant 
        extern int32_t array4[42]; // Compliant
        return 0;
}