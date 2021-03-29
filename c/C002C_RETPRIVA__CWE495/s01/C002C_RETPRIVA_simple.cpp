#include <string>
#include <vector>
using namespace std;

class Pallette {
private:
	int numOfColors;
	string colors[100];
	vector<string> backgroundColors;
public:
	Pallette() :numOfColors(100), colors(), backgroundColors() {}
	// public 메소드에서 private 배열을 반환하면 이에 대한 참조를 얻을 수 있어 의도하지 않은 수정이 발생할 수 있다.
	string* getColors2() {
		return colors;
	}
	vector<string> getColors() {
		return backgroundColors;
	}
};
