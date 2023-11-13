#include <iostream>

int main() {
    char n_array[] = "Hello" "World";
    wchar_t w_array[] = L"Hello" L"World";

    std::cout << n_array << std::endl;
    std::wcout << w_array << std::endl;

    return 0;
}
