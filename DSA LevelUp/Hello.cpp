// Use >cl filename.cpp to compile a file
// then ./filename to run

#include<iostream>
#include<vector>
using namespace std;

int main(void) {
	vector<int> arr = { 1, 2, 3, 4 };
	arr.push_back(14);
	for (int i = 0; i < arr.size(); i++) {
		cout << arr[i] << endl;
	}
	cout << "Hello, World!" << endl;
}