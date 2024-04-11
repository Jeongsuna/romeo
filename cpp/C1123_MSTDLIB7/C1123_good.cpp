#include <string>
#include <iostream>
#include <stdexcept>
#include <cstdint>

int32_t f_stoi(const char *numstr) {
    try {
        // stoi 함수 사용 (준수)
        return std::stoi(numstr);
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0;
}

float f_stof(const char *numstr) {
    try {
        // stof 함수 사용 (준수)
        return std::stof(numstr);
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0.0f;
}

int64_t f_stol(const char *numstr) {
    try {
        // stol 함수 사용 (준수)
        return std::stol(numstr);
    } catch (const std::invalid_argument& ia) {
        std::cerr << "Invalid argument: " << ia.what() << '\n';
    } catch (const std::out_of_range& oor) {
        std::cerr << "Out of range: " << oor.what() << '\n';
    }
    return 0L;
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