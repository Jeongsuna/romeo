#define DEFINED defined

// 괄호 안에 비교식 "X > Y"가 포함되어 있습니다.(비준수)
#if defined ( X > Y )

#endif
// "DEFINED" 매크로를 "defined"로 정의하여 사용하고 있습니다.(비준수)
#if DEFINED(X)

#endif

int main()
{
    return 0;
}