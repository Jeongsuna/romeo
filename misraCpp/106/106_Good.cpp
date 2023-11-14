int main(){
    int i = 0;
    int x = i;

    switch (x) 
    { 
        // switch-label은 스위치 문의 본문 내에서 사용해야 합니다. (준수)
        case 1:
            if (i == 5) 
            { 

            } 
        break;

        default:
        break;
    }
    
    return 0;
}