#include <cstdlib>
#include <cstdint>

// atoi 예제 (비준수)
int32_t f_atoi(const char *numstr) {
    // 문자열을 int로 변환
    return atoi(numstr);
}

// atof 예제 (비준수)
float f_atof(const char *numstr) {
    // 문자열을 float로 변환
    return atof(numstr);
}

// atol 예제 (비준수)
int64_t f_atol(const char *numstr) {
    // 문자열을 long int로 변환
    return atol(numstr);
}

int main() {
    const char *numStr = "12345";
    int32_t numInt = f_atoi(numStr);
    float numFloat = f_atof(numStr);
    int64_t numLong = f_atol(numStr);

    return 0;
}