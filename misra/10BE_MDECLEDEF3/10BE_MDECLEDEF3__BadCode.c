#include <stdint.h>
#include <stdio.h>

typedef uint16_t width_t;
typedef uint16_t height_t;
typedef uint32_t area_t;

void f(signed int);

void f(signed int num) {
    printf("Function f called with %d\n", num);
}

int16_t func(int16_t den, int16_t num);

int16_t func(int16_t num, int16_t den) {
    return num / den;
}

area_t area(width_t w, height_t h);

area_t area(width_t w, width_t h){
    return (area_t) w * h;
}

int main() {
    return 0;
}
