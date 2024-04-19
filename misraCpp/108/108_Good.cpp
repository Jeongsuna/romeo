int main(){
    int int16 = 1;
    // default 절을 제공하여 나머지 경우를 처리합니다.(준수)
    switch (int16) 
    {
        case 0:
            break;
        case 1:
        case 2:
            break;
        default:
            break;
    }

    // switch 문에서 enum 값을 처리하는 경우
    enum Colours { RED, BLUE, GREEN } colour;
    switch (colour) 
    {
        // 방법 1.  enum 값의 모든 가능한 경우를 처리 해야합니다.(준수)
        case RED:
            break;
        case BLUE:
            break;
        case GREEN:
            break;

        // 방법 2. default 절을 제공하여 나머지 경우를 처리합니다.(준수)
        // case RED:
        //     break;
        // case GREEN:
        //     break;
        // default:
        //     break;
    }

    return 0;
}