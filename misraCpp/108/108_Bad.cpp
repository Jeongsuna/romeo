int main(){
    int int16 = 1;

    //  switch 문을 default 절 없이 사용하고 있습니다.(비준수)
    switch (int16) 
    {
        case 0:
            break;
        case 1:
        case 2:
            break;
    }

    //  switch 문이 (enum값)RED와 GREEN 두 가지 경우만을 처리 하고 있습니다.(비준수)
    enum Colours { RED, BLUE, GREEN } colour;
    switch (colour) 
    {
        case RED:
            break;
        case GREEN:
            break;
    }
    
    return 0;
}
