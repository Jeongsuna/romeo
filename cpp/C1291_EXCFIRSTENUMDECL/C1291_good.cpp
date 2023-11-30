// 모든 열거형 멤버가 명시적으로 초기화되었습니다.(Compliant)
enum Goodcolour { red=3, blue=4, green=5, yellow=5 };

// 첫 번째 멤버만 초기화하고 있습니다. (Compliant)
enum GoodColour2 { black=3, white, purple, orange };

// 모든 열거형 멤버를 명시적으로 초기화하지 않았습니다.(Compliant)
enum GoodColour3 { kaki, skyblue, navy, lime };

// 첫 번째 멤버를 초기화하지 않고 나머지 멤버를 초기화했으므로 예외로 간주합니다.(Compliant)
enum GoodEnum { value1, value2, value3, value4=5 };

int main() { 
    return 0;
}
