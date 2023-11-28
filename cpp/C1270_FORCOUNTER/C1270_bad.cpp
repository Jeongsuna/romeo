int fn(int x){
    x += 1;
    return x;
}

int main(){
    int x;
    int y = 0;
    // 함수 fn()의 결과를 사용하여 x를 수정하고 있습니다.(비준수)
    for ( x = 0; x < 10; fn(x) ){
        y = 1;
    }

    for ( x = 0; x < 10;){
        x += 1;
    }
    
    return 0;
}