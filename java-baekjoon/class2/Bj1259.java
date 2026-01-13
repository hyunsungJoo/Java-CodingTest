import java.util.*;

public class Bj1259 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        

        while(true){
            StringBuffer sb = new StringBuffer(sc.next());
            if(sb.toString().equals("0")) break;

            StringBuffer rv = sb;

            if(sb.toString().equals(rv.reverse().toString())) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}