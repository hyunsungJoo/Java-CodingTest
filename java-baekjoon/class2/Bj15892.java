import java.util.*;

public class Bj15892 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            answer += (s.charAt(i) - 96) * (int)Math.pow(31, i);
        }

        System.out.println(answer);
    }
}