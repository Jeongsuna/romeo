int main(){
    int x, y;
    y = 0;
    // x 와 y 총 두개의 변수를 루프 카운터로 사용합니다.(비준수)
    for ( x = 0; x < y; x = y++ ){

    }
    // 루프 카운터의 타입이 Floating Type 입니다.(비준수)
    for (double z = 0; z < y; z++ ){

    }
    return 0;
}
