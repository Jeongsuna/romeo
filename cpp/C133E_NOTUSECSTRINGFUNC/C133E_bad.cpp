#include <iostream>
#include <cstring>

int main() {
    // strcpy 예제
// 미탐 : C133E 주석 참고
//    void fn ( const char_t * pChar )
//    {
//    char_t array [ 10 ];
//    strcpy ( array, pChar );
//    // Non-compliant
//    }
    char source[] = "Hello";
    char destination[20];
    strcpy(destination, source);
    std::cout << "복사된 문자열: " << destination << std::endl;

    // strcmp 예제
    char str1[] = "abc";
    char str2[] = "def";
    int result = strcmp(str1, str2);
    std::cout << "비교 결과: " << result << std::endl;

    // strcat 예제
    char dest[20] = "Hello ";
    char src[] = "world!";
    strcat(dest, src);
    std::cout << "연결된 문자열: " << dest << std::endl;

    // strchr 예제
    char str[] = "Hello";
    char ch = 'l';
    char *ptr = strchr(str, ch);
    std::cout << "첫 번째 등장 문자 '" << ch << "': " << ptr << std::endl;

    // strspn 예제
    char str1[] = "abcde12345";
    char str2[] = "abc";
    size_t len = strspn(str1, str2);
    std::cout << "일치하는 초기 세그먼트의 길이: " << len << std::endl;

    // strcspn 예제
    char str1[] = "abcde";
    char str2[] = "xyz";
    len = strcspn(str1, str2);
    std::cout << "일치하지 않는 초기 세그먼트의 길이: " << len << std::endl;

    // strpbrk 예제
    char str[] = "This is a test";
    char charset[] = "aeiou";
    ptr = strpbrk(str, charset);
    if (ptr != NULL)
        std::cout << "문자 발견: " << *ptr << std::endl;

    // strrchr 예제
    char str[] = "Hello, world!";
    char ch = 'o';
    ptr = strrchr(str, ch);
    std::cout << "마지막 등장 문자 '" << ch << "': " << ptr << std::endl;

    // strstr 예제
    char str[] = "Hello, world!";
    char substr[] = "world";
    ptr = strstr(str, substr);
    if (ptr != NULL)
        std::cout << "부분 문자열 위치: " << ptr - str << std::endl;

    // strtok 예제
    char str[] = "This is a test";
    char delim[] = " ";
    char *token = strtok(str, delim);
    while (token != NULL) {
        std::cout << "토큰: " << token << std::endl;
        token = strtok(NULL, delim);
    }

    // strlen 예제
    char str[] = "Hello, world!";
    size_t length = strlen(str);
    std::cout << "문자열 길이: " << length << std::endl;

    return 0;
}