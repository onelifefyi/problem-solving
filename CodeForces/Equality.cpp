//problem: https://codeforces.com/problemset/problem/758/A
//failing while iterating through array

#include<iostream>

int findGreatest(int prr[]){
    int max{0};
    prr = & prr[0];
    for(int ele: prr){
        if(ele>max){
            max = ele;
        }
    }
    return max;
}

int main(void){
    int n{0};    
    std::cin >> n;
    int arr[n];
    for(int i=0; i<n; i++){
        std::cin >> arr[i];
    }
    int result{0};
    int max = findGreatest(arr);
    for(int ele: arr){
        result += max - ele; 
    }
    std::cout << result;
}