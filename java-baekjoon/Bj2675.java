// 문자열 반복
import java.util.*;

public class Bj2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();
        int repeatNum = sc.nextInt();
        String testCase = sc.nextLine();

        String result = "";

        for(int i = 0; i < testCase.length(); i++){
            for(int j = 0; j < testNum; j++){
                result += tesctCase.chartAt(i);
            }
            System.out.println(result);
        }
    }
}