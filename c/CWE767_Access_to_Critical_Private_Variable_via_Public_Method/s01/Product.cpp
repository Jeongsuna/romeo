class product {
private:
	float price;
public:
	/* FLAW: Do not access to Critical Private Variable via Public Method */
	void changePrice(float newPrice){
		price = newPrice;
	}
};
