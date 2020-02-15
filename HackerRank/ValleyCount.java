// Given string describing steps of a hicker starting at sea level U=>Uphill; D=>Downhill,
// calculate the no of valleys(below sea) the hicker encountered

class ValleyCount{

    static int findValley(String path){
        int noVal = 0;
        int currAlt = 0;

        for(int i=0; i<path.length(); i++){
            currAlt += (path.charAt(i) == 'U')?1:-1;
            if(path.charAt(i) == 'D' && currAlt == -1){
                noVal++;
            }
        }
        return noVal;
    }

    public static void main(String[] args){
        String path = "DDDDDDDDDUUUUUUUUUDDDDDDDDDDDDDDD";
        System.out.println("No of Valleys: " + findValley(path));
    }
}