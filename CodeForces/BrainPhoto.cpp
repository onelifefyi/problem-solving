#include <iostream>

int main(){
    int row, col;
    bool isColor = false;
    char color;
    std::cin >> row >> col;

    for(int i=0; i<row*col; i++){
        std::cin >> color;
        if(color=='C' || color=='Y' || color=='M'){
            isColor = true;
            break;
        }
    }
    std::string result = (isColor == true) ? "#Color" : "#Black&White";
    std::cout << result;
    return 0;
}