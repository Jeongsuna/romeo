#include <iostream>
#include <cstring>
#include <string> // 추가된 헤더 파일

int main() {
    // strcpy 대안: std::string 또는 std::copy 사용
    std::string source = "Hello";
    std::string destination(source); // 또는 std::copy(source.begin(), source.end(), destination.begin());
    std::cout << "복사된 문자열: " << destination << std::endl;

    // strcmp 대안: std::string::compare 사용
    std::string str1 = "abc";
    std::string str2 = "def";
    int result = str1.compare(str2);
    std::cout << "비교 결과: " << result << std::endl;

    // strcat 대안: std::string 사용
    std::string dest = "Hello ";
    const std::string src = "world!";
    dest += src;
    std::cout << "연결된 문자열: " << dest << std::endl;

    // strchr 대안: std::string::find 사용
    std::string str = "Hello";
    char ch = 'l';
    size_t pos = str.find(ch);
    if (pos != std::string::npos)
        std::cout << "첫 번째 등장 문자 '" << ch << "': " << pos << std::endl;

    // strspn 대안: 직접 루프를 사용하여 검사
    size_t strspn(const char *str1, const char *str2) {
      size_t len = 0;
      for (; *str1 != '\0'; ++str1) {
        bool found = false;
        for (const char *ptr = str2; *ptr != '\0'; ++ptr) {
          if (*str1 == *ptr) {
            found = true;
            break;
          }
        }
        if (!found) {
          break;
        }
        len++;
      }
      return len;
    }

    // strcspn 대안: 직접 루프를 사용하여 검사
    size_t strcspn(const char *str1, const char *str2) {
      size_t len = 0;
      for (; *str1 != '\0'; ++str1) {
        for (const char *ptr = str2; *ptr != '\0'; ++ptr) {
          if (*str1 == *ptr) {
            return len;
          }
        }
        len++;
      }
      return len;
    }

    // strpbrk 대안: std::string::find_first_of 사용
    const std::string str = "This is a test";
    const std::string charset = "aeiou";
    size_t pos = str.find_first_of(charset);
    if (pos != std::string::npos)
        std::cout << "문자 발견: " << str[pos] << std::endl;

    // strrchr 대안: std::string::find_last_of 사용
    const std::string str = "Hello, world!";
    char ch = 'o';
    size_t pos = str.find_last_of(ch);
    if (pos != std::string::npos)
        std::cout << "마지막 등장 문자 '" << ch << "': " << pos << std::endl;

    // strstr 대안: std::string::find 사용
    const std::string str = "Hello, world!";
    const std::string substr = "world";
    size_t pos = str.find(substr);
    if (pos != std::string::npos)
        std::cout << "부분 문자열 위치: " << pos << std::endl;

    // strtok 대안: std::istringstream 또는 std::stringstream 사용
    std::string str = "This is a test";
    std::istringstream iss(str);
    std::string token;
    while (iss >> token)
        std::cout << "토큰: " << token << std::endl;

    // strlen 대안: std::string::length 사용
    const std::string str = "Hello, world!";
    size_t length = str.length();
    std::cout << "문자열 길이: " << length << std::endl;

    return 0;
}