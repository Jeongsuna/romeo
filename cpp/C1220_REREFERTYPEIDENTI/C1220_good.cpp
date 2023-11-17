#include <iostream>
#include <stdint.h>

typedef struct vector_1 {
    int x ; 
    int y; 
    int z; 
} vector_2;

struct vector_3 {
    int x ;
    int y;
    int z;
} vector_4;

struct vector_5{
    int x;		
    int y;		
}typedef vector_6;


int main()
{
    vector_1 v1 = {1, 2, 3};
    vector_4.x = 4;
    vector_4.y = 5;
    vector_4.z = 6;

    std::cout << "Vector1: " << v1.x << ", " << v1.y << ", " << v1.z << std::endl;
    std::cout << "Vector2: " << vector_4.x << ", " << vector_4.y << ", " << vector_4.z << std::endl;

    return 0;
}
