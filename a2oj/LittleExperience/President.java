import java.util.Scanner;
import java.util.Arrays;
class President{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int can = sObj.nextInt();
            int vot = sObj.nextInt();
            int[] score = new int[can];
            int[] votes = new int[can];
            Arrays.fill(score,0);
            Arrays.fill(votes,0);
            boolean voted = false;
            for(int i=0; i<vot; i++){
                voted = false;
                for(int ii=can-1; ii>=0; ii--){
                    int temp = sObj.nextInt();
                    //System.out.println("Scoring i=" + temp + ": " + ii);
                    score[temp-1] += ii;
                    if(!voted){
                        votes[temp-1] += 1;
                        voted = true;
                    }
                    // System.out.println("Scores: " + Arrays.toString(score));
                    // System.out.println("Votes: " + Arrays.toString(votes));
                }
            }
            // System.out.println("Votes: " + Arrays.toString(votes));
            // System.out.println("Scores: " + Arrays.toString(score));
            int maxVotes = 0;
            int maxVotes2 = 1;
            for(int p=1; p<can; p++){
                if(votes[p] > votes[maxVotes]){
                    maxVotes2 = maxVotes;
                    maxVotes = p;
                }
                else if(votes[p] > votes[maxVotes2]) maxVotes2 = p;
            }
            //System.out.println("maxVotes: " + maxVotes + " maxVotes2: " + maxVotes2);
            if(votes[maxVotes] == votes[maxVotes2]){
                int mx = 0;
                for(int pt=0; pt<can; pt++){
                    if(score[pt] > score[mx]) mx = pt;
                }
                System.out.println((mx+1) + " 2");
            }
            else{
                System.out.println((maxVotes + 1) + " 1");
            }
        }
    }
}