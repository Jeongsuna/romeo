static volatile double account;

void deposit(int amount) {
	//lock 자원 없이 공유 자원에 접근
	account += amount;
}

void withdraw(int amount) {
	account -= amount;
}
