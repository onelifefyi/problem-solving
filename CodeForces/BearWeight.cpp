// Problem: https://codeforces.com/problemset/problem/791/A
#include <iostream>
int main(void){
    int a, b, count{0};
    std::cin >> a >> b;
    while(true){
        a *= 3;
        b *= 2;
        count++;
        if(a > b){
            break;
        }
    }
    std::cout << count;
    return 0;
}