#include <string> // 헤더 추가

int32_t f1(const char* numstr) 
{
    // atoi() 함수 대신 std::stoi() 함수를 사용합니다.
    return std::stoi(numstr); 
}

double f2(const char* numstr)
{
    // atof() 함수 대신 std::stod() 함수를 사용합니다.
    return std::stod(numstr); 
}

long f3(const char* numstr)
{
    // atol() 함수 대신 std::stol() 함수를 사용합니다.
    return std::stol(numstr); 
}

int main(void){return 0;}