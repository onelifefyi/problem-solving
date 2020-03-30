//problem: https://codeforces.com/problemset/problem/785/A
import java.util.HashMap;
import java.util.Scanner;
public class NoSides{
    public static void main(String[] args){
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Tetrahedron", 4);
        hMap.put("Cube", 6);
        hMap.put("Octahedron", 8);
        hMap.put("Dodecahedron", 12);
        hMap.put("Icosahedron", 20);
        Scanner sObj = new Scanner(System.in);
        int noCases = Integer.parseInt(sObj.nextLine());
        int result = 0;
        for(int i=0; i<noCases; i++){
            result += hMap.get(sObj.nextLine());
        }
        System.out.print(result);
    }
}