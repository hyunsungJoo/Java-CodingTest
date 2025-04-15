// 소수찾기
import java.util.*;

public class Bj1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int num;
        int primeCount = 0;

        for(int i = 0; i < count; i++){
            num = sc.nextInt();

            for(int j = 1; j < num; j++){ // j가 2부터 시작하면 num이 2일때 판단불가
                if(num == 1 || j != 1 && num % j == 0) break;
                else if(j == (num -1)) primeCount++;
            }
        }
        
        System.out.println(primeCount);
    }
}