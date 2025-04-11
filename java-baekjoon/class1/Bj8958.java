// OX퀴즈
import java.util.*;

public class Bj8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gameCnt = sc.nextInt();
        String[] answerArr = new String[gameCnt];
        int[] scoreArr = new int[gameCnt];
        int score = 0;

        for(int i = 0; i < gameCnt; i++){
            answerArr[i] = sc.next();
        }
        
        for(int i = 0; i < answerArr.length; i++){
            score = 0;
            for(int j = 0; j < answerArr[i].length(); j++){
                if(answerArr[i].charAt(j) == 'O') {
                    score++;
                    scoreArr[i] += score;
                }
                else{
                    score = 0;
                }
        }
    }

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
    }
}
