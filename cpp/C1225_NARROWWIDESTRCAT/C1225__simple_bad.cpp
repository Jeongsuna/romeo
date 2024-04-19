#include <iostream>

int main() {
    wchar_t mixed1[] = "Hello" L"World"; // Non-compliant
    std::wcout << mixed1 << std::endl;
    wchar_t mixed2[] = L"Hello" "World"; // Non-compliant
        std::wcout << mixed2 << std::endl;
    return 0;
}
