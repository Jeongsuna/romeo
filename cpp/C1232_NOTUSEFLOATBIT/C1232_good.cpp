#include <cmath>
#include <cstdint>

typedef float float32_t;

float32_t My_fabs(float32_t f) 
{ 
    return std::fabs(f);
}

int main() {
    float32_t f = -3.14;
    float32_t abs_f = My_fabs(f);
    return 0;
}
