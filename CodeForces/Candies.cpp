//problem: https://codeforces.com/problemset/problem/1230/A
#include <iostream>
#include <algorithm>
int main(void){
    int arr[4];
    for(int i=0; i<4; i++){
        std::cin >> arr[i];
    }
    std::sort(arr, arr+4);
    if(arr[3] == arr[2] + arr[1] + arr[0]){
        std::cout<<"YES";
        return 0;
    }
    else if(arr[3] + arr[0] == arr[1] + arr[2]){
        std::cout<<"YES";
    }
    else{
        std::cout<<"NO";
    }
    return 0;
}
