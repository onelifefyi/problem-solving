#include <iostream>

int main(void){
    int css;
    int max = 0;
    int curr = 0;
    int in = 0;
    int out = 0;
    std::cin >> css;
    for(int i=0; i<css; i++){
        std::cin >> out;
        std::cin >> in;
        curr -= out;
        curr += in;
        if(curr > max){
            max = curr;   
        }
    }
    std::cout << max;
    return 0;
}