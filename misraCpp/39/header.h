#pragma once
#include <cstdint>

void f1();          // Compliant
void f2() {}        // Non-compliant
inline void f3() {} // Compliant
template <typename T>
void f4(T) {} // Compliant
int32_t a;    // Non-compliant