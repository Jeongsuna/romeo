// 정의된 전처리기 연산자는 두 가지 표준 타입 중 하나에서만 사용해야 합니다.(준수)
// case 1
#if defined(MACRO_NAME)
#endif

// case 2
#if defined MACRO_NAME
#endif

int main(void){return 0;}