#include <iostream>

int main() {
    wchar_t mixed[] = "Hello" L"World"; // Non-compliant
    std::wcout << mixed << std::endl;
    return 0;
}
