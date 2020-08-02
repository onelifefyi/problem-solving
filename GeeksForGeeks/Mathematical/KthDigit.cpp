// problem: https://practice.geeksforgeeks.org/problems/print-the-kth-digit/0
#include<iostream>
#include<math.h>
int main(void){
    int A{0};
    std::cin>>A;
    int B{0};
    std::cin>>B;
    int digit{0};
    std::cin>>digit;
    int result = (int)pow(A,B);
    if(digit == 1){
        std::cout<<result%10;
    }
    else{
        result /= 10*(digit-1);
        std::cout<<result%10;
    }
    return 0;
}