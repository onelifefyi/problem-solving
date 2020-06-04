//problem: https://codeforces.com/problemset/problem/1057/A

import java.util.Scanner;
import java.util.Stack;

public class Bmail{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int routers = Integer.parseInt(sObj.nextLine());
        Stack<Integer> stkObj = new Stack<Integer>();
        int[] connections = new int[routers + 1];
        for(int i=2; i<=routers; i++){
            connections[i] = sObj.nextInt();
            //System.out.print(" input = " +  connections[i]);
        }
        //System.out.println("Input taken");
        int pos = routers;
        while(connections[pos] != 1){
            //System.out.println("router #" + pos + " connected to router #" + connections[pos]);
            stkObj.push(pos);
            pos = connections[pos];
        }
        stkObj.push(pos);
        stkObj.push(1);
        while(!stkObj.empty()){
            System.out.print(stkObj.pop() + " ");
        }
        //System.out.println("router #" + pos + " connected to router #" + connections[pos]);
    } 
}