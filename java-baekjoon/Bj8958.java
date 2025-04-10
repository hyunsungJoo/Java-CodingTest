// OX퀴즈
import java.util.*;

public class Bj8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gameCnt = sc.nextInt();
        int[] scoreArr = new int[gameCnt];
        int score = 0;
        String answer = sc.next();
        int answerLength = 0;

        for(int i = 0; i < answer.length(); i++){
            if(answer.charAt(i) == 'O') {
                score++;
                scoreArr[answerLength] += score;
            }
            else{
                score = 0;
            }
            answerLength++;
        }

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
    }
}
