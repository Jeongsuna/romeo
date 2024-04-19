#include <iostream>

enum enum1
{
    enum1_ERROR,
    enum1_E1,
    enum1_E2
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
        case 0: { result = enum1_E1; break; } 
        case 1: { result = enum1_E2; break; } 
        //v가 0 또는 1이 아닌 다른 값을 가질 경우,
        //static_cast를 사용하여 enum1로 변환하면 규칙을 어길 수 있습니다.(비준수)
        default: { result = static_cast<enum1>(v); break; } 
    } 
    return result; 
}

int main() {

    // Invalid expressions
    Fruit myFruit = static_cast<Fruit>(5);
    Month currentMonth = static_cast<Month>(12);
    Status currentStatus = static_cast<Status>(-1);
    Season currentSeason = static_cast<Season>(6);
    Animal pet = static_cast<Animal>(99);

    // Output results
    std::cout << "Invalid expressions: Failure" << std::endl;

    return 0;
}
