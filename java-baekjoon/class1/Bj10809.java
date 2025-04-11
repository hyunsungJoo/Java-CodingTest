// 알파벳 찾기
import java.util.*;

public class Bj10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1); // 해당알파벳 없을 시 -1이기때문에 -1로 초기화

        for(int i = 0; i < word.length(); i++){
            if(alphabet[(int)word.charAt(i) - 97] == -1) { // 처음에 오는 위치 값을 넣기 위해
                alphabet[(int)word.charAt(i) - 97] = i;
            }
        }

        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i]);
            System.out.print(" ");
        }
    } 
}
