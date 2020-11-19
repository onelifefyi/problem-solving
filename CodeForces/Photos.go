// Problem: https://codeforces.com/problemset/problem/707/A

package main

import "fmt"

func main(){
	var rows int
	var cols int
	fmt.Scanf("%d %d", &rows, &cols)

	var ch byte
	for i:=0; i<rows+cols; i++ {
		fmt.Scanf("%s", &ch)
		fmt.Println("Scanned: ", ch)
		if(ch == 'C' || ch == 'M' || ch == 'Y'){
			fmt.Println("#Color")
			return;
		}
	}
	fmt.Println("#Black&White")
}