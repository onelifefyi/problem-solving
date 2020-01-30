// Java program for multiplication table

class JavaLoops1{
  static void mult(int num){
    for(int i=1; i<=10; i++){
       System.out.println(num + " x " + i + " = " + num*i);
    }
  }

  public static void main(String[] args){
    mult(61);
  }
}
