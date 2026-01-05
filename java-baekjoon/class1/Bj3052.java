// 나머지
import java.util.*;

public class Bj3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            int mod = num % 42;

            // 중복이 아니면 추가
            if (!list.contains(mod)) {
                list.add(mod);
            }
        }

        // 서로 다른 나머지 개수 출력
        System.out.println(list.size());
    }    
}
