#include <iostream>

typedef struct vector1 { 
    int x ; 
    int y; 
    int z; 
} vector1; 

struct vector2 { 
    int x ; 
    int y; 
    int z; 
} vector2;

struct vector3{
    int x;		
    int y;		
}typedef vector3;

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
