void log_error(int a){

}

int main(void){
    int x, y;
    if ( x < 0 ) 
    { 
        log_error ( 3 ); 
        x = 0; 
    } 
    else if ( y < 0 ) 
    { 
        x = 3; 
    } 
    // if ... else if 구문은 else 절로 종료되어야 합니다.(준수)
    // 단 if 문만 작성시 else 절이 필수는 아닙니다.
    else
    { 

    }

    return 0;
}