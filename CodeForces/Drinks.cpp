#include <iostream>
int main(void){
    int css;
    std::cin >> css;
    float result;

    for(int z=0; z<css; z++){
        int input;
        std::cin >> input;
        result += input;
    }

    std::cout << result/css;

    return 0;
}