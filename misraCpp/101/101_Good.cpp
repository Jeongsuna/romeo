int main(void){

    unsigned char port = 0x00;

    while ( ( port & 0x80 ) == 0 ) 
    { 
        // 세미콜론 뒤에 주석이 존재하고 둘 사이의 공백이 있습니다.(준수)
        ; // wait for pin
    }
    return 0;
}