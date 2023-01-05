#include <iostream>

int main(){
	int css{};
	std::cin >> css;
	
	int num{};
	for(int i{}; i<css; i++){
		std::cin >> num;
		if(num == 1){
			std::cout << "HARD";
			return 0;
		}
	}
	std::cout << "EASY";
	return 0;
}
