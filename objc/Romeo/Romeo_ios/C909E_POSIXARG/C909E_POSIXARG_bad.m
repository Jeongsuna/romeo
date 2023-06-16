#import <Foundation/Foundation.h>
#include <string.h>

void initialize(char *array) {
    memset(array, 0, 10);
}

int bad_memchr() {
    char array[10];
    initialize(array);
    void *pos = memchr(array, '@', 42); // Noncompliant
    return 0;
}

int bad_memccpy() {
    char *src = "123456789";
    char array[6];
    
    memccpy(array, src, '9', 9);    // Noncompliant
    
    return 0;
}

int bad_memcmp() {
    char src1[] = "2480389";
    char *src2 ="9893782";

    int n = memcmp(src1, src2, 30); // Noncompliant
    return n;
}

int bad_memcpy(){
    char src[4];
    char dest[] = "abcdefu";
     
    char *result = memcpy(dest, src, 10);   // Noncompliant
    return 0;
}

int bad_memmmove() {
    char src[] = "ghijk";
    char dest[] = "abcdefu";
     
    char *result = memmove(dest, src,  10);     // Noncompliant
    return 0;}

int bad_memset() {
    char src[] = "use memset";
    memset(src, 'e', 15);   // Noncompliant
    return 0;
}

int bad_stpncpy() {
    char src[] = "use stpncpy";
    char dest[7];
    stpncpy(dest, src, 17); // Noncompliant
    return 0;
}

int bad_strncat() {
    char src[] = "use strncat";
    char dest[17] = "dest";
    strncat(dest, src, 20); // Noncompliant
    return 0;
}

int bad_strncpy() {
    char src[] = "use strncpy";
    char dest[25] = "dest"; // src랑 dest 모두 보다 num이 작아야한다.
    strncpy(dest, src, 32); // Noncompliant
    
    return 0;
}

int bad_strndup() {
    char *s1 = "String";
    char *s2 = strndup(s1, 10); // Noncompliant
    NSLog(@"strndup(String, 2) == %s\n", s2);
        
    return 0;
}

size_t bad_strnlen() {
    char *src = "use strnlen";
    size_t result = strnlen(src, 20);   // Noncompliant
    
    return result;
}

int bad_strxfrm() {
    char *src = "use strxfrm";
    char dest[20];
    strxfrm(dest, src, 27);     // Noncompliant
    return 0;
}

