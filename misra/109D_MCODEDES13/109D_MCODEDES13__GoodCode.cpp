#include <mutex>
#define mutex_t std::mutex

void f(void)
{
	mutex_t m;
	m.lock();
    m.unlock(); /* Compliant */
}
int main() {
	f();
	return 0;
}