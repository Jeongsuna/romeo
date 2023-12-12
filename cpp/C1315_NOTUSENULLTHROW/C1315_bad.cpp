#include <iostream>
#include <stdint.h>

int main() {
    try {
        // NUll을 명시적으로 throw 하고있습니다.(비준수)
        throw (NULL);
        throw NULL;

    }
    // NULL 예외 핸들러
    catch (int32_t i) {
        // ...
    }
    catch (const char *) {
        // ...
    }
    return 0;
}