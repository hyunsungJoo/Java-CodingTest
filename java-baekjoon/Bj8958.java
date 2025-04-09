// OX퀴즈
import java.util.*;

public class Bj8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gameCnt = sc.nextInt();
        int[] scoreArr = new int[gamecnt];
        int score = 1;

        for(int i = 0; i < gameCnt; i++){
            String answer = sc.next();
            if(answer.charAt(i) == 'O') {
                scoreArr[i] += 1;
                score++;
            }
            else{
                socre = 1;
            }
        }
    }
}
