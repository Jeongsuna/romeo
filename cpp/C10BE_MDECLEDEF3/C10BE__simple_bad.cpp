#include <cstdint>

void fn1(int32_t a); // Non-compliant
void fn3(int32_t, int32_t e, int32_t g); // Non-compliant

void fn1(int32_t b) {
}

void fn2(int32_t b, int32_t c) {
}

void fn3(int32_t d, int32_t e, int32_t f){

}

int main(){
    return 0;
}