#include <iostream>
#include <string> 

int main(){
    int cases{0};
    std::cin >> cases;

    for(int i{0}; i<cases; i++){
        int floor{};
        std::cin >> floor;

        // prev floors keystrokes
        int digit{floor%10};
        int prev_floor_keystrokes{(digit-1)*10};
        
        // same floor keystrokes
        int num_digits = std::to_string(floor).size();
        int current_floor_keystrokes{0};

        for(int j=1; j<=num_digits; j++){
            current_floor_keystrokes += j;
        }

        std::cout << (prev_floor_keystrokes + current_floor_keystrokes) << std::endl;
    }
    return 0;
}