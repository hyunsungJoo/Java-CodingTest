// 숫자의 개수
import java.util.Scanner;

public class Bj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] arr_num = new int[10];

        int total = num1 * num2 * num3;
        String total_string = String.valueOf(total);

        for(int i = 0; i < total_string.length(); i++){
            int total_string_num = total_string.charAt(i) - '0';
            arr_num[total_string_num] ++;       
            }
            
        for(int i = 0; i < 10; i++){
        System.out.println(arr_num[i]); 
        }   
    }
}
