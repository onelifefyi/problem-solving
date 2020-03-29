//Problem: https://codeforces.com/problemset/problem/1030/A

#include <iostream>
int main(void){
    int cases, values{0};
    std::cin >> cases;
    for(int i=0; i<cases; i++){
        std::cin >> values;
        if(values==1){
            std::cout << "HARD";
            return 0;
        }
    }
    std::cout << "EASY";
    return 0;
}