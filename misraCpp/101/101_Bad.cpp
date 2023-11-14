
int main(void){

    unsigned char port = 0x00;
    
    while ( ( port & 0x80 ) == 0 ) 
    { 
        // 세미콜론(;) 앞에 주석이 존재합니다.(비준수)
        /* wait for pin */ ; 
        // 세미콜론(;)과 주석 사이의 공백이 없습니다.(비준수)
        ;// wait for pin
    }
}