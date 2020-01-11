// Finding all factors of a number.

class AllFact{
    static void printFact(int num){
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        printFact(1024);
    }
}

