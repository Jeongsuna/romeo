int fn2(int x){
    x += 1;
    return x;
}

int fake_main(){
    int x;
    int y = 0;

    for ( x = 0; x < 10;){
        // 루프 카운터(x)값을 루프 몸체 내에서 수정하지 않도록 합니다.
    }

    return 0;
}p