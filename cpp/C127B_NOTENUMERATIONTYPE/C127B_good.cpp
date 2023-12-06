#include <iostream>

enum enum1
{
    enum1_ERROR,
    enum1_E1,
    enum1_E2
};

enum EnumError
{
    ENUM_ERROR
};

enum Color { RED, GREEN, BLUE };
enum Fruit { APPLE, BANANA, ORANGE };
enum Day { SUNDAY, MONDAY, TUESDAY };
enum Month { JANUARY, FEBRUARY, MARCH };
enum Direction { UP, DOWN, LEFT, RIGHT };
enum Status { OK, ERROR };
enum Gender { MALE, FEMALE };
enum Season { SPRING, SUMMER, AUTUMN, WINTER };
enum Planet { EARTH, MARS, VENUS };
enum Animal { DOG, CAT, FISH };

enum1 convert(int16_t v) 
{ 
    enum1 result = enum1_ERROR;
    switch (v) 
    { 
        // 열거형 기본 타입이 있는 식에는 열거형의 열거자에 해당하는 값만 있어야 합니다.(준수) 
        case 0: { result = enum1_E1; break; } 
        case 1: { result = enum1_E2; break; }
        default: { throw (ENUM_ERROR); break; } 
    } 
    return result; 
}

int main(){

    // Valid expressions
    Color myColor = GREEN;
    Day today = SUNDAY;
    Direction currentDirection = LEFT;
    Gender personGender = MALE;
    Planet homePlanet = EARTH;

    // Output results
    std::cout << "Valid expressions: Success" << std::endl;

    return 0;
}