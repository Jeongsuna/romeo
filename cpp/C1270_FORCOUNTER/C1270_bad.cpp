bool modify(int *pX)
{
    *pX++;
    return ( *pX < 10 );
}

int main(){
    int x;
    // 함수 fn()의 결과를 사용하여 x를 수정하고 있습니다.(비준수)
    for (x = 0; modify(&x);)
    {
    }

    for ( x = 0; x < 10;){
        x = x*2;
    }

    return 0;
}