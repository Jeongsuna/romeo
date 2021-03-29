#include <vector>
#include <string>
using namespace std;

class Role {
private:
	string* userRoles;
	vector<string> adminRoles;
public:
	// userRoles와 adminRoles 필드는 private이지만,
	// public인 setUserRoles()와 setAdminRoles를 통해 외부의 배열에 할당되면, 사실상 public 필드가 된다.
	void setUserRoles(string newUserRoles[]) {
		this ->userRoles = newUserRoles;
	}
	void setAdminRoles(vector<string> newAdminRoles) {
		this ->adminRoles = newAdminRoles;
	}
};
