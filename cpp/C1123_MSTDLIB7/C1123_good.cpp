#include <string>   // For std::string
#include <iostream> // For std::cout, std::endl
#include <stdexcept> // For std::invalid_argument, std::out_of_range
#include <cstdint> // For int32_t, int64_t

int32_t f_stoi(const char *numstr) {
    try {
        return std::stoi(numstr); // stoi 함수 사용 (준수)
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0; // 예외 발생 시 기본값 반환 (0), 실제 사용 시 상황에 맞게 수정 필요
}

float f_stof(const char *numstr) {
    try {
        return std::stof(numstr); // stof 함수 사용 (준수)
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0.0f; // 예외 발생 시 기본값 반환 (0.0f), 실제 사용 시 상황에 맞게 수정 필요
}

int64_t f_stol(const char *numstr) {
    try {
        return std::stol(numstr); // stol 함수 사용 (준수)
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0L; // 예외 발생 시 기본값 반환 (0L), 실제 사용 시 상황에 맞게 수정 필요
}

int main() {
    const char *numStr = "12345";

    int32_t numInt = f_stoi(numStr);
    float numFloat = f_stof(numStr);
    int64_t numLong = f_stol(numStr);

    std::cout << "Converted int: " << numInt << std::endl;
    std::cout << "Converted float: " << numFloat << std::endl;
    std::cout << "Converted long: " << numLong << std::endl;

    return 0;
}