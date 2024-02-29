#include <cstdlib> // For atoi, atof, atol
#include <cstdint> // For int32_t, int64_t

// atoi 예제 (비준수)
int32_t f_atoi(const char *numstr) {
    return atoi(numstr); // 문자열을 int로 변환
}

// atof 예제 (비준수)
float f_atof(const char *numstr) {
    return atof(numstr); // 문자열을 float로 변환
}

// atol 예제 (비준수)
int64_t f_atol(const char *numstr) {
    return atol(numstr); // 문자열을 long int로 변환
}

// 메인 함수를 추가하여 예제 함수들을 테스트
int main() {
    // 예제 사용
    const char *numStr = "12345";
    int32_t numInt = f_atoi(numStr);
    float numFloat = f_atof(numStr);
    int64_t numLong = f_atol(numStr);

    return 0;
}