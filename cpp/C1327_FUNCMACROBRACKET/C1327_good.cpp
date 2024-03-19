// 매크로의 정의에서 매개변수 x가 괄호로 묶여 있습니다.(준수)
#define abs(x) (((x) >= 0) ? (x) : -(x))
#define abs1(aa) ((#aa >= 0) ? #aa : -(aa))

int main(void){return 0;}