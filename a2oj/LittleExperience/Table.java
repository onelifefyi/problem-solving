/*

* Problem: https://a2oj.com/p?ID=22
* Approach: for every element search all it's adjacent members if common found put it in a set (since we only need unique)
			A lot of loops!!! NOT COOL 
*/

import java.util.Scanner;
import java.util.HashSet;

class Table{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
	int css = sObj.nextInt();
	for(int zz=0; zz<css; zz++){
		boolean found = false;
		HashSet<Integer> hSet = new HashSet<Integer>();
		int n = sObj.nextInt();
		int m = sObj.nextInt();
		int arr[][] = new int[n][m];
		for(int ii=0; ii<n; ii++){
			for(int jj=0; jj<m; jj++) arr[ii][jj] = sObj.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(arr[i][j] == -1) continue;
				for(int x=-1; x<2; x++){
					for(int y=-1; y<2; y++){
						if(i == i+x && j == j+y) continue;
						if(i+x < 0 || i+x >= n) continue;
						if(j+y < 0 || j+y >= m) continue;
						//System.out.println("Checking: " + arr[i][j] + " of index (" + i + "," + j + ") with " + arr[i+x][j+y] + " of index (" + (i+x) + "," + (j+y) + ")");
						if(arr[i][j] == arr[i+x][j+y]){
						//	System.out.println("adding pair: " + arr[i][j] + " and " + arr[i+x][j+y]);
							hSet.add(arr[i][j]);
						//	System.out.println("Found: " + arr[i][j]);
							found=true;
							break;
						}
						
					}
					if(found){
					found = false;
					break;
					}
				}
			}
		}
		System.out.println(hSet.size());
	}
    }
}
