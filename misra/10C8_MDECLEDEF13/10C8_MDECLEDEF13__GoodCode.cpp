#include <cstdint>
#include <string.h>
uint16_t g(const uint16_t* p) {
    return *p;

}
char last_char(const char* const s) {
    return s[strlen(s) - 1u];

}
uint16_t first(const uint16_t a[5]) {
    return a[0];

}
int fake_main() {
	g(0);
	last_char((char*)"hello");
	first(0);
    return 0;
}