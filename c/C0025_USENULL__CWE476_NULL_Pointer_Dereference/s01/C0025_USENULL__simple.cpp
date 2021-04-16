int* IntegerAddressReturn() {
    int i = 10;
    int* IntegerAddress = &i;
    return IntegerAddress;
}

void NullPointerDereference(int count) {
    //IntegerAddressReturn()이 0을 return 하면 p는 null 값을 가지게 된다.
    int *p = IntegerAddressReturn();
    //null 값을 가지는 p 값을 참조하여 널 포인터 역참조 발생
    *p = count;
} 
