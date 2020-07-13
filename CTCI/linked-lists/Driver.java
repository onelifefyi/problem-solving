public class Driver{
    public static void main(String[] args){
        LinkedList lLst = new LinkedList();
        lLst.addLast(75);
        lLst.addFirst(6);
        lLst.addLast(1);
        lLst.showElements();
        System.out.println(lLst.size());
        System.out.println(lLst.valueAt(5));
    }
}