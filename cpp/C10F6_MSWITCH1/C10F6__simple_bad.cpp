int main(){
    int i = 0;
    int x = i;
    
    switch (x) 
    { 
    case 1: 
        if (i == 5) 
        { 
            // switch-label을 스위치 문의 본문 외부에서 사용하고 있습니다. (비준수)
        case 2:
            x = 2;
        } 
        break;
    default:
        break;
    }
    return 0;
}