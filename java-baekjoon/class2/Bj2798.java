// 블랙잭
/* 그럼 언제 O(N³)이 위험하냐?
N 크기	O(N³) 가능 여부
100	✅ 매우 안전
300	⚠️ 애매
500	❌ 위험
1000	❌ 절대 불가
*/
import java.util.*;

public class Bj2798 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int cardCount = sc.nextInt();
      int max = sc.nextInt();
      int[] cardNum = new int[cardCount];
      
      int n = 0;

      while(n < cardNum.length){
        cardNum[n] = sc.nextInt();
      }



  }
  
}
