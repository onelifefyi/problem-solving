class PrimeFactor{

    static void pFact(int num){
        int x=1;
        int pcount=0;
        for(int i=1; i<num/x; i++){
            if(num%i==0){
//                num/=i;
//                x=i;
                pcount=0;
                for(int j=1; j<i; j++){
                    if(i%j==0 && pcount<2){
                        pcount++;
                    }
                    if (pcount > 2) {
                        break;
                    }
                }l
//                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        pFact(100884);
    }
}
