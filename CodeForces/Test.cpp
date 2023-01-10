#include <iostream>

int main(){
	int css{};
	std::cin >> css;

	int total{0};
	int count{0};
	int current{};

	for(int i{}; i<css; i++){
		total = 0;
		for(int j{}; j<3; j++){
			std::cin >> current;
			total += current;
		}
		if(total > 1) count += 1;
	}
	std::cout << count;
}
