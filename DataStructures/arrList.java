import java.util.ArrayList;

class arrList{
    public static void main(String[] args){
        ArrayList arrLst = new ArrayList();
        arrLst.add(14);
        arrLst.add(3);
        System.out.println(arrLst);
        arrLst.add(1, 61);
        System.out.println(arrLst);
        System.out.println(arrLst.get(1));
    }
}