// 블랙잭
/* 그럼 언제 O(N³)이 위험하냐?
N 크기	O(N³) 가능 여부
100	✅ 매우 안전
300	⚠️ 애매
500	❌ 위험
1000	❌ 절대 불가
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int total = sc.nextInt();
        int[] num = new int[count];
        int answer = 0;
        
        for(int i = 0; i < count; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++ ){
                for(int k = j+1; k < num.length; k++){
                    int answer2 = num[i] + num[j] + num[k];
                    if(total - answer > total - answer2 && answer2 <= total){
                        answer = answer2;
                    }
                }
            }
        }
        System.out.println(answer);
        
    }
}
