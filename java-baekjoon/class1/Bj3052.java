// 나머지
import java.util.*;

public class Bj3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] mod = new int[10];
        int div = 42;

        for(int i = 0; i < 10; i++){
            int num = sc.nexInt();
            mod[0] += num % 42;
        }
        
        for(int i = 0; i < 10; i++){
            int num = sc.nexInt();
            mod[0] += num % 42;
        }

    }
    
}
