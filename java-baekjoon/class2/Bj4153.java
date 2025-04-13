// 직각삼각형
import java.util.*;

public class Bj4153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> answer = new ArrayList<>();

        while(true){
            int auset = sc.nextInt();
            int ausar = sc.nextInt();
            int heru = sc.nextInt();

            if(auset == 0 && ausar == 0 && heru == 0) break;

            else if(auset*auset + ausar*ausar == heru*heru){
                answer.add("right");
            }
            else answer.add("wrong");
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }

    }
}
