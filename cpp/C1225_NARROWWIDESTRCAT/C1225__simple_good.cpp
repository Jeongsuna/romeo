#include <iostream>

int main() {
    char n_array[] = "Hello" "World"; // Compliant
    wchar_t w_array[] = L"Hello" L"World"; // Compliant

    std::cout << n_array << std::endl;
    std::wcout << w_array << std::endl;

    return 0;
}
