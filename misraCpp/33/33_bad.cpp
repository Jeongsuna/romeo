#include <iostream>

typedef struct vector1 { 
    uint16_t x ; 
    uint16_t y; 
    uint16_t z; 
} vector1; 

struct vector2 { 
    uint16_t x ; 
    uint16_t y; 
    uint16_t z; 
} vector2;

int main()
{
    vector1 v1 = {1, 2, 3};
    vector2.x = 4;
    vector2.y = 5;
    vector2.z = 6;

    std::cout << "Vector1: " << v1.x << ", " << v1.y << ", " << v1.z << std::endl;
    std::cout << "Vector2: " << vector2.x << ", " << vector2.y << ", " << vector2.z << std::endl;

    return 0;
}
