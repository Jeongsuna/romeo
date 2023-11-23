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
    // if ... else if 을 사용하는데 else if로 끝나고 있습니다.(비준수)

    return 0;

}