#include <iostream>

int main() {
    try {
        // NUll을 명시적으로 throw 하고있습니다.(비준수)
        throw (NULL);

    }
    // NULL 예외 핸들러
    catch (int i) {
        // ...
    }
    catch (...) {
        // ...
    }
    return 0;
}