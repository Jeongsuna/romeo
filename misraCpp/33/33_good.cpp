#include <iostream>
#include <stdint.h>

typedef struct vector_t { 
    uint16_t x ; 
    uint16_t y; 
    uint16_t z; 
} vector_t; 

vector_t vector_instance;

int main()
{
    vector_instance.x = 1;
    vector_instance.y = 2;
    vector_instance.z = 3;

    std::cout << "Vector: " << vector_instance.x << ", " << vector_instance.y << ", " << vector_instance.z << std::endl;

    return 0;
}
